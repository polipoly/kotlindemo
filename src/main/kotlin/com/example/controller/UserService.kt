package com.example.controller

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.example.bean.User
import com.example.factory.ResultEntity
import com.example.factory.ResultFactory
import com.example.mapper.UserMapper
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserService {

    @Autowired
    var userMapper:UserMapper?=null;

    @RequestMapping(path= ["list"])
    fun list(): ResultEntity? {

        return try {
            ResultFactory.createSuccessEntity(userMapper?.selectMaps(QueryWrapper<User>()))
        } catch (e: Exception) {
            ResultFactory.createFailEntity(e.message)
        }
    }
}