package com.sxt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.benas.DeptP;
import com.sxt.service.DeptService;
import com.sxt.util.PageBean;
import com.sxt.vo.DeptVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

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

    @RequestMapping("sysadmin/deptAction_toview")
    public String toView(Model model,String id) throws Exception {
        //1、根据部门id信息查询部门信息
        DeptVo dept = service.selectDeptAndParentById(id);
        model.addAttribute("dept",dept);
        return "sysadmin/dept/jDeptView";
    }

    @RequestMapping("sysadmin/deptAction_toupdate")
    public String toUpdate(String id, Model model) throws Exception {
        // 查询部门下拉
        List<DeptVo> ds = service.selectDeptAndParent();
        model.addAttribute("ds", ds);
        DeptVo dept = service.selectDeptAndParentById(id);
        model.addAttribute("dept", dept);
        return "sysadmin/dept/jDeptUpdate";
    }

    @RequestMapping("sysadmin/deptAction_update")
    public String upDept(DeptP deptP) throws Exception {
        //1、判断父部门是否改变
        String parentIdTemp = deptP.getParentIdTemp()==null ? "" :deptP.getParentIdTemp();
        boolean flag = parentIdTemp.equals(deptP.getParentId());
        String deptNo = null;
        if(!flag){
            //根据父id获取最大的部门编号
            String maxDeptNo = service.findMaxDeptnoByParentId(deptP.getParentId());
            //父id为null的情况下
            if(StringUtils.isBlank(deptP.getParentId())){
                if(maxDeptNo == null){
                    deptNo = "0001";
                }else {
                    deptNo=String.format("%04d",Integer.valueOf(maxDeptNo)+1);
                }
            }else {
                if(maxDeptNo == null){
                    DeptVo parent = service.selectDeptAndParentById(deptP.getParentId());
                    deptNo= parent.getDeptNo()+"0001";
                }else {
                    deptNo = String.format("%0"+maxDeptNo.length()+"d",Integer.valueOf(maxDeptNo)+1);
                }
            }
        }

        deptP.setDeptNo(deptNo);
        service.updateDept(deptP);
        return "redirect:/sysadmin/deptAction_list";
    }

    @RequestMapping("sysadmin/deptAction_tocreate")
    public String toCreate(Model model) throws Exception {
        // 查询部门下拉
        List<DeptVo> ds = service.selectDeptAndParent();
        model.addAttribute("ds", ds);
        return "sysadmin/dept/jDeptCreate";
    }

    @RequestMapping("sysadmin/deptAction_insert")
    public String createDept(DeptP deptP) throws Exception {
        // 父部门
        //根据父id获取最大的部门编号
        String maxDeptNo = service.findMaxDeptnoByParentId(deptP.getParentId());
        String deptNo = "";
        //父id为null的情况下
        if(StringUtils.isBlank(deptP.getParentId())){
            if(maxDeptNo == null){
                deptNo = "0001";
            }else {
                deptNo=String.format("%04d",Integer.valueOf(maxDeptNo)+1);
            }
        }else {
            if(maxDeptNo == null){
                DeptVo parent = service.selectDeptAndParentById(deptP.getParentId());
                deptNo= parent.getDeptNo()+"0001";
            }else {
                deptNo = String.format("%0"+maxDeptNo.length()+"d",Integer.valueOf(maxDeptNo)+1);
            }
        }
        deptP.setDeptNo(deptNo);
        //生成id
        deptP.setDeptId(UUID.randomUUID().toString().replaceAll("-",""));
        deptP.setState(1);
        service.saveDept(deptP);
        return "redirect:/sysadmin/deptAction_list";
    }
}
