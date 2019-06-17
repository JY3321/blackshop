package com.cugb.dao;

import org.apache.ibatis.annotations.Param;

import com.cugb.pojo.Catelog;

import java.util.List;

public interface CatelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Catelog record);

    int insertSelective(Catelog record);

    Catelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catelog record);

    int updateByPrimaryKey(Catelog record);

    int updateCatelogNum(@Param("id") Integer id,@Param("number") Integer number);

    List<Catelog> getAllCatelog();//根据商品类别查询商品

    int getCount(Catelog catelog);
}