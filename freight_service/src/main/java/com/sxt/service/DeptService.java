package com.sxt.service;

import com.sxt.benas.DeptP;
import com.sxt.vo.DeptVo;

import java.util.List;

public interface DeptService {

    /**
     * 根据部门父id查询子部门信息
     * @return
     */
   List<DeptVo> selectDeptAndParent() throws Exception;

    /**
     * 通过id查询部门信息
     * @param id
     * @return
     * @throws Exception
     */
    DeptVo selectDeptAndParentById(String id) throws Exception;

    /**
     * 通过父id查询部门编号最大值
     * @param id
     * @return
     * @throws Exception
     */
    String findMaxDeptnoByParentId(String id) throws Exception;

    /**
     * 修改部门
     * @param deptP
     * @return
     * @throws Exception
     */
    Integer updateDept(DeptP deptP) throws Exception;

    /**
     * 新增部门
     * @param deptP
     * @return
     */
    Integer saveDept(DeptP deptP);
}
