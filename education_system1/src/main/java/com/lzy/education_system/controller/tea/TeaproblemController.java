package com.lzy.education_system.controller.tea;


import com.lzy.education_system.domain.TProblem;
import com.lzy.education_system.service.TProblemService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/tea/exam")
public class TeaproblemController {
    @Autowired
    private TProblemService tProblemService;
//    老师添加单选和多选
    @RequestMapping("/add")
    public ResponseEntity<Map> problemadd12(String type,String examtitle,String examselectA,String examselectB,String examselectC,String examselectD,String examfenshu,String examdaan){
        int i = Integer.parseInt(type);
        int number = tProblemService.TProblemNumber(i);
        HashMap<String, Object> map = new HashMap<>();
        if((i==1&&number>=4)||(i==2&&number>=2)||(i==3&&number>=2)){
            map.put("msg","添加的类型题目已超出数目，请删了相应题型后在添加");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else {
            int score = Integer.parseInt(examfenshu);
            TProblem tProblem = new TProblem(examtitle, examselectA, examselectB, examselectC, examselectD, examdaan, score, i, "no");
            int i1 = tProblemService.TProblemAdd(tProblem);
            if(i1>0){
                map.put("msg","添加成功");
            }
            else{
                map.put("msg","添加失败");
            }

            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
    }
   @RequestMapping("/shownumber")
      public ResponseEntity<Map> shownumber(){
          Map<String, Object> map = new HashMap<>();
          int singlenumber = tProblemService.TProblemNumber(1);
          int munumber = tProblemService.TProblemNumber(2);
          int judgenumber = tProblemService.TProblemNumber(3);
//       System.out.println("參數 ： " + singlenumber + ":" + munumber + ":" + judgenumber);
          map.put("singlenumber",singlenumber);
          map.put("munumber",munumber);
          map.put("judgenumber",judgenumber);
       return new ResponseEntity<Map>(map, HttpStatus.OK);
      }
}
