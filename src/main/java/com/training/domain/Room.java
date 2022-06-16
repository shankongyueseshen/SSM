package com.training.domain;

public class Room {
    private Integer roomid;

    private String roomtype;

    private Float roomprice;

    private String roomstate;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Float getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Float roomprice) {
        this.roomprice = roomprice;
    }

    public String getRoomstate() {
        return roomstate;
    }

    public void setRoomstate(String roomstate) {
        this.roomstate = roomstate;
    }
}