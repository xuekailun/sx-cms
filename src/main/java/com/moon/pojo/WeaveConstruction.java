package com.moon.pojo;

public class WeaveConstruction {
    private Integer wId;

    private String wName;

    private Integer wPid;

    private String wPath;

    private Integer wOrder;

    private Integer wIsshow;

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
        this.wName = wName == null ? null : wName.trim();
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
        this.wPath = wPath == null ? null : wPath.trim();
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
}