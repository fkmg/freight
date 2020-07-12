package com.sxt.controller;

import com.sxt.benas.UserP;
import com.sxt.service.UserpService;
import com.sxt.vo.CurrentUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserpService service;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/toMain")
    @RequiresAuthentication
    public String toMain(HttpSession session) throws Exception {
        if (session.getAttribute("_CURRENT_USER") == null) {
            // 当前登录用户的基本信息
            UserP user = (UserP) SecurityUtils.getSubject().getPrincipal();
            CurrentUser cu = service.findUserInfoDeptRolePermessionByOther(user.getUserName());
            session.setAttribute("_CURRENT_USER", cu);
        }
        return "home/fmain";
    }


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String fail(Model model, HttpServletRequest request) {
        String msg = (String) request.getAttribute("shiroLoginFailure");
        if (msg != null) {
            model.addAttribute("loginFailed", "1");
        }
        return "index";
    }
}
