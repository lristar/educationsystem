package com.lzy.education_system.controller.qiantai;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/qiantai")
public class judgelogin {
      @RequestMapping("/islogin")
    public ResponseEntity<Map> islogin(HttpSession session){
          Map<String, Object> map = new HashMap<>();
          Object username = session.getAttribute("username");
          Object usertype = session.getAttribute("usertype");
          String name = String.valueOf(username);
          String type = String.valueOf(usertype);
          if(type!=null){
              map.put("username",name);
              map.put("usertype",type);
              return new ResponseEntity<Map>(map, HttpStatus.OK);
          }
          else{
              map.put("username",null);
              map.put("usertype",null);
              return new ResponseEntity<Map>(map, HttpStatus.OK);
          }

      }
      @RequestMapping("/userexit")
      public ResponseEntity<Map> Exit(HttpSession session){
          Map<String, Object> map = new HashMap<>();
          session.removeAttribute("username");
          session.removeAttribute("usertype");
          session.removeAttribute("userid");
          if(session.getAttribute("username")==null){
              map.put("msg","退出成功");
              return new ResponseEntity<Map>(map,HttpStatus.OK);
          }
          else{
              map.put("msg","退出失败");
              return new ResponseEntity<Map>(map,HttpStatus.OK);
          }
      }
}
