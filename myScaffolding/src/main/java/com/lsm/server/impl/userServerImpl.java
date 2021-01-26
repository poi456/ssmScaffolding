package com.lsm.server.impl;

import com.lsm.dao.mapper;
import com.lsm.pojo.User;
import com.lsm.server.userServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServerImpl implements userServer {
    @Autowired
    private mapper mapper;


    @Override
    public List<User> query() {
        System.out.println("草拟吗");
//        return null;
        return mapper.query();
    }
}
