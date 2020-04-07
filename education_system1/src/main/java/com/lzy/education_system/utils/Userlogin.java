package com.lzy.education_system.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

//登录封装
public class Userlogin {
    public ResponseEntity<Map> userlogin(Object user){
        Map<String,Object> map = new HashMap<String,Object>();
        //登录成功
        if(user!=null){
            map.put("msg","登录成功");
            map.put("user",user);
            return new ResponseEntity<Map>(map, HttpStatus.OK);

        }
        //登录失败
        else{

            map.put("msg","账号密码错误");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }

    }
}
