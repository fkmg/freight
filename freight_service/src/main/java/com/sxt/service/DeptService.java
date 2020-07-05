package com.sxt.service;

import com.sxt.benas.DeptP;

import java.util.List;

public interface DeptService {

    /**
     * 根据部门父id查询子部门信息
     * @return
     */
   List<DeptP> selectDeptAndParent();
}
