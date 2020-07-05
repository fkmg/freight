package com.sxt.realm;


import com.sxt.benas.ModuleP;
import com.sxt.benas.RoleP;
import com.sxt.benas.UserP;
import com.sxt.service.UserpService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserpService userpService;

    /**
     * 授权
     * @param principal
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        UserP user = (UserP)principal.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<RoleP> roleList = null;
        List<ModuleP> moduleList = null;
        RoleP role = null;
        ModuleP module = null;
        try {
            roleList = userpService.getRolesByAccount(user.getUserName());

            if(roleList != null && roleList.size()>0){

                for(int i = 0; i< roleList.size();i++){
                    role = roleList.get(i);
                    info.addRole(role.getName());
                }
            }

            if (moduleList != null && moduleList.size()>0){
                for(int i = 0; i< moduleList.size();i++){
                    module = moduleList.get(i);
                    info.addStringPermission(module.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }

    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        // 获取用户名
        String username = (String) token.getPrincipal();
        // 使用用户名查询密码和盐
        UserP user = null;
        SimpleAuthenticationInfo info = null;
        try {
            user = userpService.getPasswordAndSaltByAccount(username);
            if(user != null){
                info = new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(user.getUserName() + user.getUserId()), this.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }
}
