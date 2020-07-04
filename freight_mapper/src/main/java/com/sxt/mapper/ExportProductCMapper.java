package com.sxt.mapper;

import com.sxt.benas.ExportProductC;
import com.sxt.benas.ExportProductCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExportProductCMapper {
    long countByExample(ExportProductCExample example);

    int deleteByExample(ExportProductCExample example);

    int deleteByPrimaryKey(String exportProductId);

    int insert(ExportProductC record);

    int insertSelective(ExportProductC record);

    List<ExportProductC> selectByExample(ExportProductCExample example);

    ExportProductC selectByPrimaryKey(String exportProductId);

    int updateByExampleSelective(@Param("record") ExportProductC record, @Param("example") ExportProductCExample example);

    int updateByExample(@Param("record") ExportProductC record, @Param("example") ExportProductCExample example);

    int updateByPrimaryKeySelective(ExportProductC record);

    int updateByPrimaryKey(ExportProductC record);
}