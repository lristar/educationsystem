package com.lzy.education_system.controller.admin;

import com.lzy.education_system.domain.TAdmin;
import com.lzy.education_system.service.TAdminService;
import com.lzy.education_system.utils.Userlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class TAminController {
    @Autowired
    private TAdminService tAdminService;

    //管理员登录
    @RequestMapping("/login")
    @ResponseBody
    public ResponseEntity<Map> TAdminlogin(HttpServletRequest request, String adminname, String adminpassword){
//        String userName = request.getParameter("adminname");
//        String userPw = request.getParameter("adminpassword");
//        System.out.println(userName);
//        System.out.println(userPw);
        TAdmin tAdmin = null;
        try {
            tAdmin = tAdminService.TadminLogin(adminname,adminpassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Userlogin userlogin = new Userlogin();
        ResponseEntity<Map> admin = userlogin.userlogin(tAdmin);
        return admin;

    }

    //管理员添加
    @RequestMapping("/add")
    public ResponseEntity<Map> TAdminAdd(HttpServletRequest request, HttpServletResponse response){
        String userName = request.getParameter("userName");
        String userPw = request.getParameter("userPw");
        Map<String, Object> map = new HashMap<String, Object>();
        int i=0;
        try {
             i = tAdminService.TadminAdd(userName, userPw);

        } catch (Exception e) {
            e.printStackTrace();
        }
      if (i>0){//添加成功
          map.put("msg","添加成功");
           return new ResponseEntity<Map>(map, HttpStatus.OK);
      }
      else{//添加失败
          map.put("msg","添加失败");
          return new ResponseEntity<Map>(map, HttpStatus.BAD_REQUEST);


      }

    }

    //管理员删除
    @RequestMapping("/del")
    public String TAdminDel(HttpServletRequest request,HttpServletResponse response){
        String adminid = request.getParameter("id");
        int id = Integer.parseInt(adminid);

        int i = tAdminService.TadminDel(id);
        if (i>0){
            return "success";
        }
        else{
            return "shibai.jsp";
        }
    }
    //管理员修改密码
    @RequestMapping("/pwedit")
    @ResponseBody
    public ResponseEntity<Map> TAdminPwEdit(String adminName, String adminpw){

        Map<String, Object> map = new HashMap<String, Object>();
        int i = tAdminService.TAdminPwEdit(adminpw,adminName);
        System.out.println(i);
        System.out.println(adminName);
        System.out.println(adminpw);
        if(i>0){
           map.put("msg","修改密码成功");
            return new ResponseEntity<Map>(map, HttpStatus.OK);


        }
        else{
            map.put("msg","修改密码失败");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
    }
}
