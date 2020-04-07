package com.lzy.education_system;

import com.github.pagehelper.PageInfo;

import com.lzy.education_system.domain.*;
import com.lzy.education_system.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;
import java.util.List;

@SpringBootTest(classes =EducationSystemApplication.class )
public class ServiceTest {
    @Autowired
    private TAdminService tAdminService;
    @Autowired
    private TAnnouncementService tAnnouncementService;
    @Autowired
    private TStuService tStuService;
    @Autowired
    private TTaskService tTaskService;
    @Autowired
    private TVideoService tVideoService;
    @Autowired
    private TProfessionService tProfessionService;
    @Autowired
    private TTeaService tTeaService;
    @Autowired
    private TMessageService tMessageService;
    @Autowired
    private TProblemService tProblemService;

    @Test
    public void Test(){
        List<TAdmin> tAdmins = tAdminService.TadminAll();
        for (TAdmin tAdmin : tAdmins) {
            System.out.println(tAdmin);
        }


    }
    @Test
    public void Test1(){
        PageInfo<TAnnouncement> tAnnouncementPageInfo = tAnnouncementService.TAnnounceFindBypage(1, 2);
        System.out.println(tAnnouncementPageInfo);
    }
    @Test
    public void Test2(){
        PageInfo<TStu> pageInfo = tStuService.TStuByPage(2, 2);
        System.out.println(pageInfo);
    }
    @Test
    public void Test3(){
        PageInfo<TTask> tTaskPageInfo = tTaskService.TTaskBypage(2, 2);
        System.out.println(tTaskPageInfo);
    }
    @Test
    public void Test4(){
        PageInfo<TVideo> tVideoPageInfo = tVideoService.TvdieoBypage(1, 2);
        System.out.println(tVideoPageInfo);
    }
    @Test
    public void test5(){
        PageInfo<TProfession> page = tProfessionService.TProfessionBypage(1, 2);
        System.out.println(page);

    }
//    @Test
//    public void testaddtea(){
//        TTea tTea = new TTea("005", "张三", "男", 35, "no", "000000");
//        int i = tTeaService.TTeaAdd(tTea);
//        System.out.println(i);
//    }
    @Test
    public void teststu(){
        PageInfo<TStu> tStuPageInfo = tStuService.TStuByPage(1, 2);
        System.out.println(tStuPageInfo);
    }
//@Test
//    public void testaddstu(){
//
//        TStu tStu = new TStu("2019001", "王涛", "男", 23, 2, "2016-09-01", "no", "000000");
//        int i = tStuService.TStuAdd(tStu);
//        System.out.println(i);
//    }

    @Test
    public void testdelzhuanye(){
        int i = tProfessionService.TProfessionDel(2);
        System.out.println(i);
    }

    @Test
    public void testshow(){
        PageInfo<TMessage> tMessagePageInfo = tMessageService.TMessageFindBypage(1, 4);
        System.out.println(tMessagePageInfo);
    }

    @Test
    public void testvedioshow(){
        PageInfo<TVideo> tVideoPageInfo = tVideoService.TvdieoBypage(1, 2);
        System.out.println(tVideoPageInfo);
    }
    @Test
    public void testtproblemshow(){
        int i = tProblemService.TProblemNumber(1);
        System.out.println(i);
    }
}
