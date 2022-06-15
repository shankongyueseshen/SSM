package com.training.controller;

import com.training.domain.Room;
import com.training.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController    //符合RESTFul风格的controller，    HTTP语义化风格  ，  一般返回JSON数据
@Controller(value = "roomController")   //普通的controller
@RequestMapping("/room")    //http://localhost:8888/SSM_war      /room
public class RoomController {

    @Autowired
    private RoomService roomService;
/*
* 方法不是返回@ResponseBody类型则认为返回的是视图名，按照springmvc.xml中的配置添加前缀和后缀
* 如果方法没有没有返回值   void    则  请求路径     /room/get   作为默认视图名称
* 如果方法返回的是   String   （hello）， 则返回视图地址      http://localhost:8888/SSM_war   /WEB-INF/pages/    hello   .jsp
* */
    @RequestMapping(value = "/get")   //http://localhost:8888/SSM_war      /room    /get
    public String test01(){
//        Room room =roomService.selectByPrimaryKey(2);
        System.out.println("谷静静");
        return "hello";   //  http://localhost:8888/SSM_war   /WEB-INF/pages/    hello   .jsp
    }

    @ResponseBody   //响应数据不需要视图解析器介入，返回值即HTTP的响应数据本身
    @RequestMapping(value = "/list")
    public String roomlist(){
        return "hello";
    }

    //返回较为复杂的内容，   数据+ 视图
    @RequestMapping(value = "/list1")
    public ModelAndView roomlist1(){
        ModelAndView modelAndView = new ModelAndView("hello");
        List<Room> rooms = roomService.selectAll();
        modelAndView.addObject("lists",rooms);
        return modelAndView;
    }



}
