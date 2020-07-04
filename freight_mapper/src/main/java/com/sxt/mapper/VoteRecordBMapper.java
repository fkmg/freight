package com.sxt.mapper;

import com.sxt.benas.VoteRecordB;
import com.sxt.benas.VoteRecordBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteRecordBMapper {
    long countByExample(VoteRecordBExample example);

    int deleteByExample(VoteRecordBExample example);

    int deleteByPrimaryKey(String voteRecordId);

    int insert(VoteRecordB record);

    int insertSelective(VoteRecordB record);

    List<VoteRecordB> selectByExample(VoteRecordBExample example);

    VoteRecordB selectByPrimaryKey(String voteRecordId);

    int updateByExampleSelective(@Param("record") VoteRecordB record, @Param("example") VoteRecordBExample example);

    int updateByExample(@Param("record") VoteRecordB record, @Param("example") VoteRecordBExample example);

    int updateByPrimaryKeySelective(VoteRecordB record);

    int updateByPrimaryKey(VoteRecordB record);
}