package com.training.domain;

import java.util.Date;

public class In {
    private Integer inid;

    private String costomername;

    private String costomertype;

    private Date costomerindate;

    private Date costomeroutdate0;

    private Integer roomid;

    private String workerid;

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getCostomername() {
        return costomername;
    }

    public void setCostomername(String costomername) {
        this.costomername = costomername;
    }

    public String getCostomertype() {
        return costomertype;
    }

    public void setCostomertype(String costomertype) {
        this.costomertype = costomertype;
    }

    public Date getCostomerindate() {
        return costomerindate;
    }

    public void setCostomerindate(Date costomerindate) {
        this.costomerindate = costomerindate;
    }

    public Date getCostomeroutdate0() {
        return costomeroutdate0;
    }

    public void setCostomeroutdate0(Date costomeroutdate0) {
        this.costomeroutdate0 = costomeroutdate0;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid;
    }
}