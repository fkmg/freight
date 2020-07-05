package com.sxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("homeAction_title")
    public String homeAction_title() throws Exception {
        return "home/title";
    }

    @RequestMapping("homeAction_toleft")
    public String homeAction_left(String moduleName, Model model) throws Exception {
        model.addAttribute("moduleName", moduleName);
        return moduleName + "/left";
    }

    @RequestMapping("homeAction_tomain")
    public String homeAction_main(String moduleName, Model model) throws Exception {
        model.addAttribute("moduleName", moduleName);
        return moduleName + "/main";
    }
}
