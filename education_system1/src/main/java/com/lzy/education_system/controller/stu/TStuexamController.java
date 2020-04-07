package com.lzy.education_system.controller.stu;

import com.lzy.education_system.domain.TProblem;
import com.lzy.education_system.service.TProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stu/exam")
public class TStuexamController {
    @Autowired
    private TProblemService tProblemService;
    @RequestMapping("/final")
    public ResponseEntity<Map> examfinal(String singlevalues,String singleids,String judgevalues, String judgeids, String Muvalues, String Muids){
        int singlenumber = tProblemService.TProblemNumber(1);
        int munumber = tProblemService.TProblemNumber(2);
        int judgenumber = tProblemService.TProblemNumber(3);

        String[] singlevalue=new String[singlenumber];
        String[] judgevalue=new String[judgenumber];
        String[] muvalue=new String[munumber];
        String[] singleid=new String[singlenumber];
        String[] muid=new String[singlenumber];
        String[] judgeid=new String[judgenumber];
        String[] singledaan=new String[singlenumber];
        String[] judgedaan=new String[judgenumber];
        String[] mudaan=new String[munumber];
        //分割单选多选和判断题
        for (int i=0;i<singlenumber;i++){
             singlevalue = singlevalues.split(",");
             singleid = singleids.split(",");
        }
        for (int j=0;j<munumber;j++){
            muvalue=Muvalues.split(",");
            muid=Muids.split(",");
        }
        for (int k=0;k<judgenumber;k++){
            judgevalue=judgevalues.split(",");
            judgeid=judgeids.split(",");
        }
//        for (String s : singlevalue) {
//            System.out.println(s);
//        }
////        for (String sid : singleid) {
////            System.out.println(sid);
////        }
//        for (String m : muvalue) {
//            System.out.println(m);
//        }
//        for (String ju : judgevalue) {
//            System.out.println(ju);
//        }


//
//        System.out.println(singlevalues);
//            System.out.println(singleids);
//
//        System.out.println(judgevalues);
//        System.out.println(judgeids);
//        System.out.println(Muids);
//        System.out.println(Muvalues);

        Map<String, Object> map = new HashMap<>();

//        int[] singlescore=new int[singlenumber];
//        int[] muscore=new int[munumber];
//        int[] judgescore=new int[judgenumber];
        int totalscore=0;

        for(int i=0;i<singlenumber;i++){
            TProblem tProblem = tProblemService.TProblemFindById(Integer.parseInt(singleid[i]));
            String daan = tProblem.getDaan();
            singledaan[i]=daan;
            if(daan.equals(singlevalue[i])){
                System.out.println("单选题答对一题");
                totalscore+=tProblem.getFenshu();
            }
            else{
                System.out.println("单选题答错一题");
                totalscore+=0;

            }
        }
        for (int j=0;j<judgenumber;j++){
            TProblem tProblem = tProblemService.TProblemFindById(Integer.parseInt(judgeid[j]));
            String daan = tProblem.getDaan();
            judgedaan[j]=daan;
            if (daan.equals(judgevalue[j])){
                System.out.println("多选题答对一题");
                totalscore+=tProblem.getFenshu();

            }
            else{
                System.out.println("多选题答错一题");
                totalscore+=0;

            }

        }
        for(int k=0;k<munumber;k++){
            TProblem tProblem = tProblemService.TProblemFindById(Integer.parseInt(muid[k]));
            String daan = tProblem.getDaan();
            mudaan[k]=daan;
            if (daan.equals(muvalue[k])){
                System.out.println("判断题答对一题");
                totalscore+=tProblem.getFenshu();

            }
            else{
                System.out.println("判断题答错一题");
                totalscore+=0;

            }
        }
//                System.out.println(totalscore);
//        for (int i : singlescore) {
//            System.out.println(i);
//        }
         map.put("singledaan",singledaan);
        map.put("mudaan",mudaan);
        map.put("judgedaan",judgedaan);
        map.put("totalscore",totalscore);

        return new ResponseEntity<Map>(map, HttpStatus.OK);

    }
}
