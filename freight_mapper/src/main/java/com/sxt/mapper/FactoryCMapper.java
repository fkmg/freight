package com.sxt.mapper;

import com.sxt.benas.FactoryC;
import com.sxt.benas.FactoryCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FactoryCMapper {
    long countByExample(FactoryCExample example);

    int deleteByExample(FactoryCExample example);

    int deleteByPrimaryKey(String factoryId);

    int insert(FactoryC record);

    int insertSelective(FactoryC record);

    List<FactoryC> selectByExample(FactoryCExample example);

    FactoryC selectByPrimaryKey(String factoryId);

    int updateByExampleSelective(@Param("record") FactoryC record, @Param("example") FactoryCExample example);

    int updateByExample(@Param("record") FactoryC record, @Param("example") FactoryCExample example);

    int updateByPrimaryKeySelective(FactoryC record);

    int updateByPrimaryKey(FactoryC record);
}