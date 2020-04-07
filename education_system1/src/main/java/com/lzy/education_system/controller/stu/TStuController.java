package com.lzy.education_system.controller.stu;


import com.lzy.education_system.domain.TStu;
import com.lzy.education_system.service.TStuService;
import com.lzy.education_system.utils.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/stu")
public class TStuController {

    @Autowired
    private TStuService tStuService;
    @RequestMapping("/login")
    @ResponseBody
    public ResponseEntity<Map> loginStu(String username, String userpassword, HttpSession session){
        Map<String,Object> map = new HashMap<String,Object>();
        TStu tStu = null;
        try {
            tStu = tStuService.TStulogin(username, userpassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(tStu!=null){
            String name = tStu.getName();
            int type = tStu.getType();
            int id = tStu.getId();
            session.setAttribute("username",name);
            session.setAttribute("userid",id);
            session.setAttribute("usertype",type);
            map.put("msg","登录成功");
            map.put("username",name);
            map.put("usertype",type);
            map.put("userid",id);
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
