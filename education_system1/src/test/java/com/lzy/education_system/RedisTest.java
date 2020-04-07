package com.lzy.education_system;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest(classes = EducationSystemApplication.class)
public class RedisTest {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void Test(){
        //redis中获得数据
        BoundValueOperations<String, String> userList = redisTemplate.boundValueOps("user.findAll");
        //判断redis中是否存在数据
        if(userList==null){
        //不存在数据，从数据库中查找
            //将查询出的数据存储到redis缓存中
            ObjectMapper objectMapper = new ObjectMapper();
//            userList = objectMapper.writeValueAsString(all);
//            //获取完存入redis
//            redisTemplate.boundValueOps("user.findAll").set((userList));

            System.out.println("----从数据库中获得user的数据");
    }
    }
}
