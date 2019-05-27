package com.moon.pojo;

import lombok.Data;

public class WeaveConstruction {



    private Integer wId;

    private String wName;

    private Integer wPid;

    private String wPath;

    private Integer wOrder;

    private Integer wIsshow;

    private Integer wType;

    private String wTemplate;

    private Integer wIslist;

    private String tname;
    private String sname;
    private Integer pid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "WeaveConstruction{" +
                "wId=" + wId +
                ", wName='" + wName + '\'' +
                ", wPid=" + wPid +
                ", wPath='" + wPath + '\'' +
                ", wOrder=" + wOrder +
                ", wIsshow=" + wIsshow +
                ", wType=" + wType +
                ", wTemplate='" + wTemplate + '\'' +
                ", wIslist=" + wIslist +
                '}';
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public Integer getwPid() {
        return wPid;
    }

    public void setwPid(Integer wPid) {
        this.wPid = wPid;
    }

    public String getwPath() {
        return wPath;
    }

    public void setwPath(String wPath) {
        this.wPath = wPath;
    }

    public Integer getwOrder() {
        return wOrder;
    }

    public void setwOrder(Integer wOrder) {
        this.wOrder = wOrder;
    }

    public Integer getwIsshow() {
        return wIsshow;
    }

    public void setwIsshow(Integer wIsshow) {
        this.wIsshow = wIsshow;
    }

    public Integer getwType() {
        return wType;
    }

    public void setwType(Integer wType) {
        this.wType = wType;
    }

    public String getwTemplate() {
        return wTemplate;
    }

    public void setwTemplate(String wTemplate) {
        this.wTemplate = wTemplate;
    }

    public Integer getwIslist() {
        return wIslist;
    }

    public void setwIslist(Integer wIslist) {
        this.wIslist = wIslist;
    }
}