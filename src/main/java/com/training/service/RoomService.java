package com.training.service;

import com.training.domain.Room;

import java.util.List;

public interface RoomService {
    Room selectByPrimaryKey(Integer rid);
    List<Room> selectAll();

    Integer addOne(Room record);
}
