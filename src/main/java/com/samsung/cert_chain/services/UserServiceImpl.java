package com.samsung.cert_chain.services;

import com.samsung.cert_chain.mapper.UsrinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")

public class UserServiceImpl implements IUserService {

    @Autowired
    private UsrinfoMapper userDao;//这里可能会报错，但是并不会影响

    @Override
    public List findAllUser(){
        return  userDao.findAllUser();
    }
}