package com.lzy.education_system.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
//增删工具类
public class CRUtils {
    public ResponseEntity<Map> CRUtils(int user,String yes,String no){
        Map<String,Object> map = new HashMap<String,Object>();
        //成功
        if(user>0){
            map.put("msg",yes);
            return new ResponseEntity<Map>(map, HttpStatus.OK);

        }
        //失败
        else{
            map.put("msg",no);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }

    }
}
