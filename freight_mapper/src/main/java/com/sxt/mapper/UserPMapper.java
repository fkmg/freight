package com.sxt.mapper;

import com.sxt.benas.UserP;
import com.sxt.benas.UserPExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPMapper {
    long countByExample(UserPExample example);

    int deleteByExample(UserPExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserP record);

    int insertSelective(UserP record);

    List<UserP> selectByExample(UserPExample example);

    UserP selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByExample(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByPrimaryKeySelective(UserP record);

    int updateByPrimaryKey(UserP record);

    /**
     * 根据账户名获取用户信息
     * @param account
     * @return
     */
    UserP getPasswordAndSaltByAccount(String account);
}