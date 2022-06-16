package com.training.domain;

import java.util.Date;

public class Out {
    private Integer outid;

    private String costomername;

    private String costomertype;

    private Date costomerindate;

    private Date costomeroutdate1;

    private Integer roomid;

    private String workerid;

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
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

    public Date getCostomeroutdate1() {
        return costomeroutdate1;
    }

    public void setCostomeroutdate1(Date costomeroutdate1) {
        this.costomeroutdate1 = costomeroutdate1;
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