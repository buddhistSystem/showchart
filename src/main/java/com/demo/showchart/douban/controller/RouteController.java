package com.demo.showchart.douban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回页面控制器
 */
@Controller
public class RouteController {

    /**
     * 测试
     *
     * @return
     */
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }


    /**
     * 原网站模板
     *
     * @return
     */
    @RequestMapping("source")
    public String source() {
        return "html/douban/source.html";
    }

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "html/douban/index.html";
    }

    /**
     * 列表页
     *
     * @return
     */
    @RequestMapping("list")
    public String list() {
        return "html/douban/list.html";
    }

    /**
     * 评分页
     *
     * @return
     */
    @RequestMapping("score")
    public String score() {
        return "html/douban/score.html";
    }

    /**
     * 词云页
     *
     * @return
     */
    @RequestMapping("word")
    public String word() {
        return "html/douban/word.html";
    }

    /**
     * 团队页
     *
     * @return
     */
    @RequestMapping("team")
    public String team() {
        return "html/douban/team.html";
    }

}
