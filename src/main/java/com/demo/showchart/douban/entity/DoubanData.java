package com.demo.showchart.douban.entity;

public class DoubanData {
    private Integer id;

    private String infoLink;

    private String picLink;

    private String cname;

    private String ename;

    private Double score;

    private Integer rated;

    private String instroduction;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink == null ? null : infoLink.trim();
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink == null ? null : picLink.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getRated() {
        return rated;
    }

    public void setRated(Integer rated) {
        this.rated = rated;
    }

    public String getInstroduction() {
        return instroduction;
    }

    public void setInstroduction(String instroduction) {
        this.instroduction = instroduction == null ? null : instroduction.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}