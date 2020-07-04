package com.sxt.mapper;

import com.sxt.benas.AccessLogP;
import com.sxt.benas.AccessLogPExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessLogPMapper {
    long countByExample(AccessLogPExample example);

    int deleteByExample(AccessLogPExample example);

    int deleteByPrimaryKey(String accessLogId);

    int insert(AccessLogP record);

    int insertSelective(AccessLogP record);

    List<AccessLogP> selectByExample(AccessLogPExample example);

    AccessLogP selectByPrimaryKey(String accessLogId);

    int updateByExampleSelective(@Param("record") AccessLogP record, @Param("example") AccessLogPExample example);

    int updateByExample(@Param("record") AccessLogP record, @Param("example") AccessLogPExample example);

    int updateByPrimaryKeySelective(AccessLogP record);

    int updateByPrimaryKey(AccessLogP record);
}