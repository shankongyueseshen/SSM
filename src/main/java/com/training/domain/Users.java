package com.training.domain;

import java.util.List;

public class Users {
    private String user;

    private Long currentConnections;

    private Long totalConnections;

    private Room room;    //1:1映射

    private List<Room> rooms;//1:N映射

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    public Long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }
}
