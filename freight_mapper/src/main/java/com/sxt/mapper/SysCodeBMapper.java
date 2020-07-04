package com.sxt.mapper;

import com.sxt.benas.SysCodeB;
import com.sxt.benas.SysCodeBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysCodeBMapper {
    long countByExample(SysCodeBExample example);

    int deleteByExample(SysCodeBExample example);

    int deleteByPrimaryKey(String sysCodeId);

    int insert(SysCodeB record);

    int insertSelective(SysCodeB record);

    List<SysCodeB> selectByExample(SysCodeBExample example);

    SysCodeB selectByPrimaryKey(String sysCodeId);

    int updateByExampleSelective(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    int updateByExample(@Param("record") SysCodeB record, @Param("example") SysCodeBExample example);

    int updateByPrimaryKeySelective(SysCodeB record);

    int updateByPrimaryKey(SysCodeB record);
}