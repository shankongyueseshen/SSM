package com.training.service.impl;

import com.training.dao.RoomMapper;
import com.training.dao.UsersMapper;
import com.training.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.service.UsersService;

/*
* @Controller   控制层组件
* @Service      业务层组件
* @Repositry    持久层组件
* @Component    通用组件
* */
@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {
//    开启自动注入
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public Users chayonghu(Integer uid) {
        usersMapper.selectByExample(null);//业务1
        roomMapper.selectByPrimaryKey(uid);//业务2
        //..........
        return null;
    }
}
