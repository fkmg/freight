package com.sxt.mapper;

import com.sxt.benas.HomePackingListC;
import com.sxt.benas.HomePackingListCExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HomePackingListCMapper {
    long countByExample(HomePackingListCExample example);

    int deleteByExample(HomePackingListCExample example);

    int deleteByPrimaryKey(String homePackingListId);

    int insert(HomePackingListC record);

    int insertSelective(HomePackingListC record);

    List<HomePackingListC> selectByExample(HomePackingListCExample example);

    HomePackingListC selectByPrimaryKey(String homePackingListId);

    int updateByExampleSelective(@Param("record") HomePackingListC record, @Param("example") HomePackingListCExample example);

    int updateByExample(@Param("record") HomePackingListC record, @Param("example") HomePackingListCExample example);

    int updateByPrimaryKeySelective(HomePackingListC record);

    int updateByPrimaryKey(HomePackingListC record);
}