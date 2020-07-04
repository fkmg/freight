package com.sxt.mapper;

import com.sxt.benas.ContractProductC;
import com.sxt.benas.ContractProductCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContractProductCMapper {
    long countByExample(ContractProductCExample example);

    int deleteByExample(ContractProductCExample example);

    int deleteByPrimaryKey(String contractProductId);

    int insert(ContractProductC record);

    int insertSelective(ContractProductC record);

    List<ContractProductC> selectByExample(ContractProductCExample example);

    ContractProductC selectByPrimaryKey(String contractProductId);

    int updateByExampleSelective(@Param("record") ContractProductC record, @Param("example") ContractProductCExample example);

    int updateByExample(@Param("record") ContractProductC record, @Param("example") ContractProductCExample example);

    int updateByPrimaryKeySelective(ContractProductC record);

    int updateByPrimaryKey(ContractProductC record);
}