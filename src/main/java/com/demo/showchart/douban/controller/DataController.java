package com.demo.showchart.douban.controller;

import com.demo.showchart.douban.dao.DoubanDataMapper;
import com.demo.showchart.douban.entity.DoubanData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DataController {

    @Resource
    private DoubanDataMapper doubanDataMapper;

    /**
     * 列表页
     *
     * @return
     */
    @RequestMapping("listData")
    public List<DoubanData> listData() {
        return doubanDataMapper.listDoubanData();
    }


}
