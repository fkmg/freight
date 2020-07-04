package com.sxt.mapper;

import com.sxt.benas.RoleP;
import com.sxt.benas.RolePExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePMapper {
    long countByExample(RolePExample example);

    int deleteByExample(RolePExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(RoleP record);

    int insertSelective(RoleP record);

    List<RoleP> selectByExample(RolePExample example);

    RoleP selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") RoleP record, @Param("example") RolePExample example);

    int updateByExample(@Param("record") RoleP record, @Param("example") RolePExample example);

    int updateByPrimaryKeySelective(RoleP record);

    int updateByPrimaryKey(RoleP record);
}