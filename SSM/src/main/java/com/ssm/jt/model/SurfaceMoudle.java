package com.ssm.jt.model;

import java.util.ArrayList;
import java.util.List;

public class SurfaceMoudle {
    private Integer id;

    private Integer pid;

    private String text;

    private String icon;

    private String url;
    private List<SurfaceMoudle> child=new ArrayList<SurfaceMoudle>();

    public List<SurfaceMoudle> getChild() {
        return child;
    }

    public void setChild(List<SurfaceMoudle> child) {
        this.child = child;
    }

    public SurfaceMoudle(Integer id, Integer pid, String text, String icon, String url) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.icon = icon;
        this.url = url;
    }

    @Override
    public String toString() {
        return "SurfaceMoudle{" +
                "id=" + id +
                ", pid=" + pid +
                ", text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public SurfaceMoudle() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}