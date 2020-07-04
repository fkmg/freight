package com.sxt.mapper;

import com.sxt.benas.ShippingOrderC;
import com.sxt.benas.ShippingOrderCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingOrderCMapper {
    long countByExample(ShippingOrderCExample example);

    int deleteByExample(ShippingOrderCExample example);

    int deleteByPrimaryKey(String shippingOrderId);

    int insert(ShippingOrderC record);

    int insertSelective(ShippingOrderC record);

    List<ShippingOrderC> selectByExample(ShippingOrderCExample example);

    ShippingOrderC selectByPrimaryKey(String shippingOrderId);

    int updateByExampleSelective(@Param("record") ShippingOrderC record, @Param("example") ShippingOrderCExample example);

    int updateByExample(@Param("record") ShippingOrderC record, @Param("example") ShippingOrderCExample example);

    int updateByPrimaryKeySelective(ShippingOrderC record);

    int updateByPrimaryKey(ShippingOrderC record);
}