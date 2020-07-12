package com.sxt.service;

import com.sxt.vo.DeptVo;

import java.util.List;

public interface DeptService {

    /**
     * 根据部门父id查询子部门信息
     * @return
     */
   List<DeptVo> selectDeptAndParent() throws Exception;
}
