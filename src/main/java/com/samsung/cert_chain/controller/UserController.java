package com.samsung.cert_chain.controller;


import com.samsung.cert_chain.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/user"})
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = {"/findAll"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public List getAllUsers() {
        List list = userService.findAllUser();
        return list;
    }
}