package com.sxt.mapper;

import com.sxt.benas.InvoiceC;
import com.sxt.benas.InvoiceCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvoiceCMapper {
    long countByExample(InvoiceCExample example);

    int deleteByExample(InvoiceCExample example);

    int deleteByPrimaryKey(String invoiceId);

    int insert(InvoiceC record);

    int insertSelective(InvoiceC record);

    List<InvoiceC> selectByExample(InvoiceCExample example);

    InvoiceC selectByPrimaryKey(String invoiceId);

    int updateByExampleSelective(@Param("record") InvoiceC record, @Param("example") InvoiceCExample example);

    int updateByExample(@Param("record") InvoiceC record, @Param("example") InvoiceCExample example);

    int updateByPrimaryKeySelective(InvoiceC record);

    int updateByPrimaryKey(InvoiceC record);
}