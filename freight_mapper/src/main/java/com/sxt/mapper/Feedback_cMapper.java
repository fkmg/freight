package com.sxt.mapper;

import com.sxt.benas.Feedback_c;
import com.sxt.benas.Feedback_cExample;
import com.sxt.benas.Feedback_cWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Feedback_cMapper {
    long countByExample(Feedback_cExample example);

    int deleteByExample(Feedback_cExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(Feedback_cWithBLOBs record);

    int insertSelective(Feedback_cWithBLOBs record);

    List<Feedback_cWithBLOBs> selectByExampleWithBLOBs(Feedback_cExample example);

    List<Feedback_c> selectByExample(Feedback_cExample example);

    Feedback_cWithBLOBs selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") Feedback_cWithBLOBs record, @Param("example") Feedback_cExample example);

    int updateByExampleWithBLOBs(@Param("record") Feedback_cWithBLOBs record, @Param("example") Feedback_cExample example);

    int updateByExample(@Param("record") Feedback_c record, @Param("example") Feedback_cExample example);

    int updateByPrimaryKeySelective(Feedback_cWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Feedback_cWithBLOBs record);

    int updateByPrimaryKey(Feedback_c record);
}