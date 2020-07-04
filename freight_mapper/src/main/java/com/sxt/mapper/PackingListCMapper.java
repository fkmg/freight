package com.sxt.mapper;

import com.sxt.benas.PackingListC;
import com.sxt.benas.PackingListCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackingListCMapper {
    long countByExample(PackingListCExample example);

    int deleteByExample(PackingListCExample example);

    int deleteByPrimaryKey(String packingListId);

    int insert(PackingListC record);

    int insertSelective(PackingListC record);

    List<PackingListC> selectByExample(PackingListCExample example);

    PackingListC selectByPrimaryKey(String packingListId);

    int updateByExampleSelective(@Param("record") PackingListC record, @Param("example") PackingListCExample example);

    int updateByExample(@Param("record") PackingListC record, @Param("example") PackingListCExample example);

    int updateByPrimaryKeySelective(PackingListC record);

    int updateByPrimaryKey(PackingListC record);
}