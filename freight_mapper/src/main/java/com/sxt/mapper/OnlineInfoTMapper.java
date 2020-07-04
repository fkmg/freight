package com.sxt.mapper;

import com.sxt.benas.OnlineInfoT;
import com.sxt.benas.OnlineInfoTExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OnlineInfoTMapper {
    long countByExample(OnlineInfoTExample example);

    int deleteByExample(OnlineInfoTExample example);

    int insert(OnlineInfoT record);

    int insertSelective(OnlineInfoT record);

    List<OnlineInfoT> selectByExample(OnlineInfoTExample example);

    int updateByExampleSelective(@Param("record") OnlineInfoT record, @Param("example") OnlineInfoTExample example);

    int updateByExample(@Param("record") OnlineInfoT record, @Param("example") OnlineInfoTExample example);
}