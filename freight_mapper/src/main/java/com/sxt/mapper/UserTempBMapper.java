package com.sxt.mapper;

import com.sxt.benas.UserTempB;
import com.sxt.benas.UserTempBExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTempBMapper {
    long countByExample(UserTempBExample example);

    int deleteByExample(UserTempBExample example);

    int deleteByPrimaryKey(String userTempId);

    int insert(UserTempB record);

    int insertSelective(UserTempB record);

    List<UserTempB> selectByExample(UserTempBExample example);

    UserTempB selectByPrimaryKey(String userTempId);

    int updateByExampleSelective(@Param("record") UserTempB record, @Param("example") UserTempBExample example);

    int updateByExample(@Param("record") UserTempB record, @Param("example") UserTempBExample example);

    int updateByPrimaryKeySelective(UserTempB record);

    int updateByPrimaryKey(UserTempB record);
}