package com.lzy.education_system;

import com.lzy.education_system.dao.*;
import com.lzy.education_system.domain.TAdmin;
import com.lzy.education_system.domain.TMessage;
import com.lzy.education_system.domain.TProblem;
import com.lzy.education_system.domain.TStu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(classes =EducationSystemApplication.class )
public class MybatisTest {
    //注入需要测试的Dao
    @Autowired
    private TAdminDao tAdminDao;
    @Autowired
    private TStuDao tStuDao;
    @Autowired
    private TMessageDao tMessageDao;
    @Autowired
    private TProblemDao tProblemDao;
    @Autowired
    private TVideoDao tVideoDao;
    @Autowired
    private TTaskDao tTaskDao;
    @Test
    public void test(){

        List<TAdmin> tAdmins = tAdminDao.TadminAll();
        for (TAdmin tAdmin : tAdmins) {
            System.out.println(tAdmin);
        }
    }
    @Test
    public void test1(){
        List<TStu> tStus = tStuDao.TStuAll();
        System.out.println(tStus);
    }

    @Test
    public void test02(){
        List<TMessage> tMessages = tMessageDao.TMessageFindAll();
        for (TMessage tMessage : tMessages) {
            System.out.println(tMessage);
        }
    }
    @Test
    public void test03(){
        List<TProblem> tProblems = tProblemDao.TProblemFindAll();
        for (TProblem tProblem : tProblems) {
            System.out.println(tProblem);
        }
    }
    @Test
    public void test04(){
        int i = tVideoDao.TVideoDel(1);
        int i1 = tTaskDao.TTaskDel(1);
        System.out.println(i1);
        System.out.println(i);
    }
    @Test
   public void test05(){
//       TProblem tProblem = new TProblem("你是中国人么", "T", "F", "null", "null", "T", 10, 3, "no");
//       int i = tProblemDao.TProblemAdd(tProblem);
        int i = tProblemDao.TProblemNumber(3);
        System.out.println(i);
   }
   @Test
   public void testmes(){
       List<TMessage> tMessages = tMessageDao.TMessageFindAll();
       for (TMessage tMessage : tMessages) {
           System.out.println(tMessage);
       }
   }
}
