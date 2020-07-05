package com.sxt.mapper;

import com.sxt.benas.ModuleP;
import com.sxt.benas.ModulePExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModulePMapper {
    long countByExample(ModulePExample example);

    int deleteByExample(ModulePExample example);

    int deleteByPrimaryKey(String moduleId);

    int insert(ModuleP record);

    int insertSelective(ModuleP record);

    List<ModuleP> selectByExample(ModulePExample example);

    ModuleP selectByPrimaryKey(String moduleId);

    int updateByExampleSelective(@Param("record") ModuleP record, @Param("example") ModulePExample example);

    int updateByExample(@Param("record") ModuleP record, @Param("example") ModulePExample example);

    int updateByPrimaryKeySelective(ModuleP record);

    int updateByPrimaryKey(ModuleP record);

    /**
     * 根据用户账户信息获取用户权限信息
     * @param account
     * @return
     */
    List<ModuleP> getpermissionsByAccoune(String account);
}