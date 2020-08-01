package com.sxt.service;

import com.sxt.benas.ModuleP;
import com.sxt.benas.RoleP;
import com.sxt.benas.UserP;
import com.sxt.util.TreeNode;
import com.sxt.vo.CurrentUser;

import java.util.List;
import java.util.Map;

public interface UserpService {

    /**
     * 用户登录
     *
     * @param username
     * @return
     * @throws Exception
     */
    UserP getPasswordAndSaltByAccount(String username) throws Exception;

    /**
     * 查询用户角色
     *
     * @param username
     * @return
     * @throws Exception
     */
    List<RoleP> getRolesByAccount(String username) throws Exception;

    /**
     * 查询用户权限
     *
     * @param username
     * @return
     * @throws Exception
     */
    List<ModuleP> getpermissionsByAccount(String username) throws Exception;

    /**
     * 封装用户所有的信息
     *
     * @param username
     * @return
     * @throws Exception
     */
    CurrentUser findUserInfoDeptRolePermessionByOther(String username) throws Exception;

    /**
     * 查询所有用户的信息
     * @return
     */
    List<UserP> findAllUsers() throws Exception;

    /**
     * 根据用户id查询用户详情
     * @param id
     * @return
     */
    UserP getUserById(String id);

    /**
     * 获取上级的层次数据
     * @param userId
     * @return
     * @throws Exception
     */
    List<TreeNode> getDegreeTree(String userId) throws Exception;

    /**
     * 查询修改用户所用的所有信息
     * @param id
     * @return
     */
    Map<String, Object> getViewOfUpdate(String id) throws Exception;
}
