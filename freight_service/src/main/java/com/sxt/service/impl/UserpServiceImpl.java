package com.sxt.service.impl;

import com.sxt.benas.*;
import com.sxt.mapper.*;
import com.sxt.service.UserpService;
import com.sxt.util.TreeNode;
import com.sxt.vo.CurrentUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserpServiceImpl implements UserpService {

    @Autowired
    private UserPMapper userPMapper;

    @Autowired
    private RolePMapper rolePMapper;

    @Autowired
    private ModulePMapper modulePMapper;

    @Autowired
    private UserInfoPMapper userInfoPMapper;

    @Autowired
    private DeptPMapper deptPMapper;

    @Override
    public UserP getPasswordAndSaltByAccount(String username) throws Exception {
        return userPMapper.getPasswordAndSaltByAccount(username);
    }

    @Override
    public List<RoleP> getRolesByAccount(String username) throws Exception {
        return rolePMapper.getRolesByAccount(username);
    }

    @Override
    public List<ModuleP> getpermissionsByAccount(String username) throws Exception {
        return modulePMapper.getpermissionsByAccoune(username);
    }

    @Override
    public CurrentUser findUserInfoDeptRolePermessionByOther(String username) throws Exception {
        CurrentUser currentUser = new CurrentUser();
        //1、根据用户名获取用户的信息
        UserPExample userPExample = new UserPExample();
        UserPExample.Criteria criteria = userPExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<UserP> userPList = userPMapper.selectByExample(userPExample);
        UserP userP = null;
        UserInfoP userInfoP = null;
        DeptP deptP = null;
        List<RoleP> roles = null;
        List<ModuleP> modules = null;
        if(userPList != null && userPList.size()>0){
            userP = userPList.get(0);
        }
        //2、获取用户的详情信息
        if(userP != null){
            //用户详情信息
            userInfoP = userInfoPMapper.selectByPrimaryKey(userP.getUserId());
            //部门信息
            deptP = deptPMapper.selectByPrimaryKey(userP.getDeptId());
            //角色信息
            roles = rolePMapper.getRolesByAccount(username);
            //权限信息
            modules = modulePMapper.getpermissionsByAccoune(username);
        }

        currentUser.setUser(userP);
        currentUser.setUserInfo(userInfoP);
        currentUser.setDept(deptP);
        currentUser.setRoles(roles);
        currentUser.setModules(modules);

        return currentUser;
    }

    @Override
    public List<UserP> findAllUsers() throws Exception{
        return userPMapper.selectByExample(null);
    }

    @Override
    public UserP getUserById(String id) {
        return userPMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TreeNode> getDegreeTree(String userId) throws Exception {
        //1、声明返回的结果集
        List<TreeNode> treeNodes = null;
        //2、声明节点
        TreeNode treeNode = null;
        List<TreeNode> nodes = null;
        List<TreeNode> treeNodesTemp = new ArrayList<>();
        //3、声明Map储存树节点
        Map<String,List<TreeNode>> treeNodeMap = new HashMap<>();
        //4、查询用户详情信息
        UserInfoP user = null;
        List<UserInfoP> infoPList = userInfoPMapper.selectByExample(null);
        if(infoPList != null && infoPList.size()>0){
            //5、组装树节点
            for(int i = 0; i< infoPList.size();i++){
                user = infoPList.get(i);
                treeNode = new TreeNode();
                treeNode.setId(user.getUserInfoId());
                treeNode.setName(user.getName());
                treeNode.setOpen(false);
                //初始化是否为父节点
                treeNode.setIsParent(false);
                //6、将节点放到map中
                if(StringUtils.isBlank(user.getManagerId())){
                    //最高节点,没有双亲
                    nodes = treeNodeMap.get("ancestor");
                    if(nodes == null){
                        nodes = new ArrayList<>();
                    }
                    nodes.add(treeNode);
                    //将集合放到map中
                    treeNodeMap.put("ancestor",nodes);
                }else {
                    //父节点不为空
                    nodes = treeNodeMap.get(user.getManagerId());
                    if(nodes == null){
                        nodes = new ArrayList<>();
                    }
                    nodes.add(treeNode);
                    //将集合放到map中
                    treeNodeMap.put(user.getManagerId(),nodes);
                }
                treeNodesTemp.add(treeNode);

            }

            //组装树节点
            for(int i = 0; i< treeNodesTemp.size();i++){
                treeNode = treeNodesTemp.get(i);
                //从集合中取出treenNode的子节点
                treeNodes = treeNodeMap.get(treeNode.getId());
                if(treeNodes != null && treeNodes.size()>0){
                    treeNode.setIsParent(true);
                }

                //判断是否隐藏
                if (StringUtils.isNotBlank(userId) && userId.equals(treeNode.getId())) {
                    treeNode.setIsHidden(true);
                }
                treeNode.setChildren(treeNodes);
            }
            //取出祖先节点
            treeNodes = new ArrayList<>();
            treeNodes.addAll(treeNodeMap.get("ancestor")==null?new ArrayList<>() : treeNodeMap.get("ancestor"));
        }
        return treeNodes;
    }

    @Override
    public Map<String, Object> getViewOfUpdate(String id) throws Exception {
        Map<String,Object> result = new HashMap<>();
        //1、查询用户信息
        result.put("u",userPMapper.selectByPrimaryKey(id));
        //2、查询用户详情信息
        result.put("uf",userInfoPMapper.selectByPrimaryKey(id));
        //3、查询所有部门信息
        result.put("ds",deptPMapper.selectDeptAndParent());
        return result;
    }
}