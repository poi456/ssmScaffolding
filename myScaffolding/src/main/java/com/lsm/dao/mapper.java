package com.lsm.dao;

import com.lsm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface mapper {
    List<User> query();
}
