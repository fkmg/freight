package com.sxt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.benas.UserP;
import com.sxt.service.UserpService;
import com.sxt.util.PageBean;
import com.sxt.util.TreeNode;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserpService service;

    @RequestMapping("sysadmin/userAction_list")
    @RequiresAuthentication
    public String toList(PageBean pb, Model model) throws Exception {
        //1、先将url设置到pb中
        pb.setUrl("sysadmin/userAction_list");
        PageHelper.startPage(pb.getCurPage().intValue(),pb.getPageSize().intValue());
        //2、查询用户列表信息
        List<UserP> ds = service.findAllUsers();
        // 将查询数据交给pageInfo 进行处理
        PageInfo<UserP> info = new PageInfo<>(ds);
        // 返回分页后的数据
        List<UserP> list = info.getList();
        // 存放总条数
        pb.setTotalRows(info.getTotal());
        pb.setDatas(list);
        model.addAttribute("pb", pb);
        return "sysadmin/user/jUserList";
    }


    @RequestMapping("sysadmin/userAction_toview")
    @RequiresAuthentication
    public String toView(String id,Model model) throws Exception {

        UserP user=service.getUserById(id);
        model.addAttribute("u", user);
        return "sysadmin/user/jUserView";
    }

    @RequestMapping("sysadmin/userAction_degreeTree")
    @ResponseBody
    @RequiresAuthentication
    public TreeNode getDegreeTree(String userId) throws Exception {
        List<TreeNode> allNodes = service.getDegreeTree(userId);
        TreeNode treeNode = new TreeNode();
        treeNode.setId(null);
        treeNode.setIsParent(true);
        treeNode.setOpen(false);
        treeNode.setName("大佬");
        treeNode.setChildren(allNodes);
        return treeNode;
    }

    @RequestMapping("sysadmin/userAction_toupdate")
    @RequiresAuthentication
    public String toUpdateUserView(String id,Model model) throws Exception {

        //1、查询用户修改所用信息
        Map<String,Object> resultMap = service.getViewOfUpdate(id);
        model.addAllAttributes(resultMap);
        return "sysadmin/user/jUserUpdate";
    }

    @RequestMapping("sysadmin/userAction_update")
    @RequiresAuthentication
    public String updateUser() throws Exception {

        //1、查询用户修改所用信息
        return "sysadmin/user/jUserUpdate";
    }
}
