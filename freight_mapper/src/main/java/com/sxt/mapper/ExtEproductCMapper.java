package com.sxt.mapper;

import com.sxt.benas.ExtEproductC;
import com.sxt.benas.ExtEproductCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtEproductCMapper {
    long countByExample(ExtEproductCExample example);

    int deleteByExample(ExtEproductCExample example);

    int deleteByPrimaryKey(String extEproductId);

    int insert(ExtEproductC record);

    int insertSelective(ExtEproductC record);

    List<ExtEproductC> selectByExample(ExtEproductCExample example);

    ExtEproductC selectByPrimaryKey(String extEproductId);

    int updateByExampleSelective(@Param("record") ExtEproductC record, @Param("example") ExtEproductCExample example);

    int updateByExample(@Param("record") ExtEproductC record, @Param("example") ExtEproductCExample example);

    int updateByPrimaryKeySelective(ExtEproductC record);

    int updateByPrimaryKey(ExtEproductC record);
}