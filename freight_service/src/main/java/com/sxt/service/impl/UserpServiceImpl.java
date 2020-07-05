package com.sxt.service.impl;

import com.sxt.benas.*;
import com.sxt.mapper.*;
import com.sxt.service.UserpService;
import com.sxt.vo.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}