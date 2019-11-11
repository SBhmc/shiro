package com.ssm.jt.model;

public class SurfaceUser {
    private Integer uid;

    private Integer eid;

    private String uname;

    private String upwd;

    private Integer ujur;

    @Override
    public String toString() {
        return "SurfaceUser{" +
                "uid=" + uid +
                ", eid=" + eid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ujur=" + ujur +
                '}';
    }

    public SurfaceUser(Integer uid, Integer eid, String uname, String upwd, Integer ujur) {
        this.uid = uid;
        this.eid = eid;
        this.uname = uname;
        this.upwd = upwd;
        this.ujur = ujur;
    }

    public SurfaceUser() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUjur() {
        return ujur;
    }

    public void setUjur(Integer ujur) {
        this.ujur = ujur;
    }
}