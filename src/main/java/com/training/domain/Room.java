package com.training.domain;

import java.io.Serializable;

public class Room implements Serializable {
    private Integer rid;

    private String rdes;

    private String rno;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRdes() {
        return rdes;
    }

    public void setRdes(String rdes) {
        this.rdes = rdes;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public Room() {
    }

    public Room(Integer rid, String rdes, String rno) {
        this.rid = rid;
        this.rdes = rdes;
        this.rno = rno;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rdes='" + rdes + '\'' +
                ", rno='" + rno + '\'' +
                '}';
    }
}
