package com.sxt.mapper;

import com.sxt.benas.FinanceC;
import com.sxt.benas.FinanceCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinanceCMapper {
    long countByExample(FinanceCExample example);

    int deleteByExample(FinanceCExample example);

    int deleteByPrimaryKey(String financeId);

    int insert(FinanceC record);

    int insertSelective(FinanceC record);

    List<FinanceC> selectByExample(FinanceCExample example);

    FinanceC selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") FinanceC record, @Param("example") FinanceCExample example);

    int updateByExample(@Param("record") FinanceC record, @Param("example") FinanceCExample example);

    int updateByPrimaryKeySelective(FinanceC record);

    int updateByPrimaryKey(FinanceC record);
}