package com.sxt.vo;

import com.sxt.benas.DeptP;

public class DeptVo extends DeptP {

    /**临时变量,存储上级变量名称**/
    private String parentDeptName;

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName;
    }
}
