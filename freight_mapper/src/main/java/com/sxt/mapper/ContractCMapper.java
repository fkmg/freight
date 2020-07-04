package com.sxt.mapper;

import com.sxt.benas.ContractC;
import com.sxt.benas.ContractCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContractCMapper {
    long countByExample(ContractCExample example);

    int deleteByExample(ContractCExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(ContractC record);

    int insertSelective(ContractC record);

    List<ContractC> selectByExample(ContractCExample example);

    ContractC selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") ContractC record, @Param("example") ContractCExample example);

    int updateByExample(@Param("record") ContractC record, @Param("example") ContractCExample example);

    int updateByPrimaryKeySelective(ContractC record);

    int updateByPrimaryKey(ContractC record);
}