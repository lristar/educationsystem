package com.lzy.education_system.controller.tea;

import com.lzy.education_system.domain.TTea;
import com.lzy.education_system.service.TTeaService;
import com.lzy.education_system.utils.Userlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tea")
public class TTeaController {
    @Autowired
    private TTeaService tTeaService;
    //老师登录
    @RequestMapping("/login")
    public ResponseEntity<Map> loginTea(String username, String userpassword,HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();
        TTea tea = null;
        try {
             tea = tTeaService.TTealogin(username, userpassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //登录成功
        if(tea!=null){
            String name = tea.getName();
            int type = tea.getType();
            int id = tea.getId();
            session.setAttribute("username",name);
            session.setAttribute("usertype",type);
            session.setAttribute("userid",id);
            map.put("msg","登录成功");
            map.put("username",name);
            map.put("usertype",type);
            return new ResponseEntity<Map>(map, HttpStatus.OK);

        }
        //登录失败
        else{
            map.put("username",null);
            map.put("usertype","3");
            map.put("msg","账号密码错误");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }


    }
}
