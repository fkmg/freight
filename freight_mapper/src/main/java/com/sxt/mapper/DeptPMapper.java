package com.sxt.mapper;

import com.sxt.benas.DeptP;
import com.sxt.benas.DeptPExample;
import com.sxt.vo.DeptVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptPMapper {
    long countByExample(DeptPExample example);

    int deleteByExample(DeptPExample example);

    int deleteByPrimaryKey(String deptId);

    int insert(DeptP record);

    int insertSelective(DeptP record);

    List<DeptP> selectByExample(DeptPExample example);

    DeptP selectByPrimaryKey(String deptId);

    int updateByExampleSelective(@Param("record") DeptP record, @Param("example") DeptPExample example);

    int updateByExample(@Param("record") DeptP record, @Param("example") DeptPExample example);

    int updateByPrimaryKeySelective(DeptP record);

    int updateByPrimaryKey(DeptP record);

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
}