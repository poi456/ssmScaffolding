package com.lsm.controller;

import com.lsm.pojo.User;
import com.lsm.server.impl.userServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private userServerImpl userServer;
    @RequestMapping("hello")
    public String demo(){
        List<User> query = userServer.query();
        System.out.println(query+" asd");
        return "text";
    }
}
