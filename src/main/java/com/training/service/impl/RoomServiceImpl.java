package com.training.service.impl;

import com.training.dao.RoomMapper;
import com.training.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.service.RoomService;

import java.util.List;

@Service(value = "roomService")
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Room selectByPrimaryKey(Integer rid) {
        return roomMapper.selectByPrimaryKey(rid);
    }

    @Override
    public List<Room> selectAll() {
        return roomMapper.selectByExample(null);
    }

    @Override
    public Integer addOne(Room record) {
        return roomMapper.insert(record);
    }
}
