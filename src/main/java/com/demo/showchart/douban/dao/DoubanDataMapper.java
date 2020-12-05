package com.demo.showchart.douban.dao;

import com.demo.showchart.douban.entity.DoubanData;

import java.util.List;

public interface DoubanDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DoubanData record);

    int insertSelective(DoubanData record);

    DoubanData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DoubanData record);

    int updateByPrimaryKey(DoubanData record);

    List<DoubanData> listDoubanData();
}