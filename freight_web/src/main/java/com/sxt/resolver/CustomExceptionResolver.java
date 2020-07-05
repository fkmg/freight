package com.sxt.resolver;

import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        ex.printStackTrace();

        String msg = null;

        //判断异常显示不同的信息
        if (ex instanceof UnauthenticatedException) {
            msg = "回话超时,请重新登录";
        } else {
            msg = "未知错误,请联系管理员";
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", msg);
        modelAndView.addObject("stack", ex);
        modelAndView.setViewName("error");

        return modelAndView;

    }
}
