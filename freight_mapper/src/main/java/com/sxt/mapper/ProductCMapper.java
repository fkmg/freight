package com.sxt.mapper;

import com.sxt.benas.ProductC;
import com.sxt.benas.ProductCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCMapper {
    long countByExample(ProductCExample example);

    int deleteByExample(ProductCExample example);

    int deleteByPrimaryKey(String productId);

    int insert(ProductC record);

    int insertSelective(ProductC record);

    List<ProductC> selectByExample(ProductCExample example);

    ProductC selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") ProductC record, @Param("example") ProductCExample example);

    int updateByExample(@Param("record") ProductC record, @Param("example") ProductCExample example);

    int updateByPrimaryKeySelective(ProductC record);

    int updateByPrimaryKey(ProductC record);
}