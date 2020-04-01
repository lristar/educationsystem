package com.example.ajaxhtml.controller;

import com.example.ajaxhtml.domain.UserInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("login")
    public ResponseEntity<String> login(@RequestBody UserInfo user) {
        System.out.println("user = " + user);
        if (user.getName().equals("zzz")) {
            return ResponseEntity.ok("success");
        }
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);

    }
}
