package com.sxt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.service.DeptService;
import com.sxt.util.PageBean;
import com.sxt.vo.DeptVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping("sysadmin/deptAction_list")
    public String toMain(Model model, PageBean pb) throws Exception {
        pb.setUrl("sysadmin/deptAction_list");
        PageHelper.startPage(pb.getCurPage().intValue(), pb.getPageSize().intValue());
        List<DeptVo> ds = service.selectDeptAndParent();
        PageInfo<DeptVo> info = new PageInfo<>(ds);
        pb.setDatas(info.getList());
        pb.setTotalRows(info.getTotal());
        model.addAttribute("pb", pb);
        return "sysadmin/dept/jDeptList";
    }
}
