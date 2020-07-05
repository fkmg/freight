package com.sxt.vo;

import com.sxt.benas.*;

import java.io.Serializable;
import java.util.List;

/**
 * 当前用户信息类
 */
public class CurrentUser implements Serializable {
    private UserP user;
    private UserInfoP userInfo;
    private DeptP dept;
    private List<RoleP> roles;
    private List<ModuleP> modules;

    public UserP getUser() {
        return user;
    }

    public void setUser(UserP user) {
        this.user = user;
    }

    public UserInfoP getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoP userInfo) {
        this.userInfo = userInfo;
    }

    public DeptP getDept() {
        return dept;
    }

    public void setDept(DeptP dept) {
        this.dept = dept;
    }

    public List<RoleP> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleP> roles) {
        this.roles = roles;
    }

    public List<ModuleP> getModules() {
        return modules;
    }

    public void setModules(List<ModuleP> modules) {
        this.modules = modules;
    }
}
