package com.sxt.mapper;

import com.sxt.benas.ExportC;
import com.sxt.benas.ExportCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExportCMapper {
    long countByExample(ExportCExample example);

    int deleteByExample(ExportCExample example);

    int deleteByPrimaryKey(String exportId);

    int insert(ExportC record);

    int insertSelective(ExportC record);

    List<ExportC> selectByExample(ExportCExample example);

    ExportC selectByPrimaryKey(String exportId);

    int updateByExampleSelective(@Param("record") ExportC record, @Param("example") ExportCExample example);

    int updateByExample(@Param("record") ExportC record, @Param("example") ExportCExample example);

    int updateByPrimaryKeySelective(ExportC record);

    int updateByPrimaryKey(ExportC record);
}