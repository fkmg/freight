package com.sxt.mapper;

import com.sxt.benas.ExtCproductC;
import com.sxt.benas.ExtCproductCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtCproductCMapper {
    long countByExample(ExtCproductCExample example);

    int deleteByExample(ExtCproductCExample example);

    int deleteByPrimaryKey(String extCproductId);

    int insert(ExtCproductC record);

    int insertSelective(ExtCproductC record);

    List<ExtCproductC> selectByExample(ExtCproductCExample example);

    ExtCproductC selectByPrimaryKey(String extCproductId);

    int updateByExampleSelective(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    int updateByExample(@Param("record") ExtCproductC record, @Param("example") ExtCproductCExample example);

    int updateByPrimaryKeySelective(ExtCproductC record);

    int updateByPrimaryKey(ExtCproductC record);
}