package com.training.controller;

import com.training.domain.Room;
import com.training.service.RoomService;
import com.training.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController    //符合RESTFul风格的controller，    HTTP语义化风格  ，  一般返回JSON数据
//@Controller(value = "roomController")   //普通的controller
@RequestMapping("/roomrest")    //http://localhost:8888/SSM_war      /room
public class RoomRESTController {

    @Autowired
    private RoomService roomService;

    //   xxxx/rootrest/room    接口  ，  GET获取一个room， post增加一个room
    @RequestMapping(value = "/rooms",method = RequestMethod.GET)
    public MessageAndData getrooms(){
        //
        List<Room> rooms = roomService.selectAll();
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("lists",rooms).setMessage("查询房间成功");
        return messageAndData;
    }

    @RequestMapping(value = "/room/{rid}",method = RequestMethod.GET)
    public MessageAndData getroom(@PathVariable("rid") Integer rid){
        //rest风格中变量是路径的一部分
        //
        Room room = roomService.selectByPrimaryKey(rid);
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj",room).setMessage("查询单一房间成功");
        return messageAndData;
    }

//    @RequestMapping(value = "/room/{rid}/{rdes}/{rno}",method = RequestMethod.POST)
    @RequestMapping(value = "/room",method = RequestMethod.POST)
    //Spring会将前端传送的数据自动封装为实体类型 【按字段匹配封装】 表单组件name为rdes，则封装为Room的rdes属性
    public MessageAndData addroom(Room room){
        Integer num = roomService.addOne(room);
        MessageAndData messageAndData = MessageAndData.success();
        messageAndData.add("obj",num).setMessage("添加房间成功");
        return messageAndData;
    }

}
