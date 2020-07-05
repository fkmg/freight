package com.sxt.service;

import com.sxt.benas.ModuleP;
import com.sxt.benas.RoleP;
import com.sxt.benas.UserP;
import com.sxt.vo.CurrentUser;

import java.util.List;

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
}
