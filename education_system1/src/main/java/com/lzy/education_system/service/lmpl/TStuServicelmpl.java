package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TClassDao;
import com.lzy.education_system.dao.TStuDao;
import com.lzy.education_system.domain.EasyUIDataGridEesult;
import com.lzy.education_system.domain.TClass;
import com.lzy.education_system.domain.TStu;
import com.lzy.education_system.service.TStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TStuServicelmpl implements TStuService {
     @Autowired
    private TStuDao tStuDao;
     @Autowired
     private TClassDao tClassDao;


    public TStu TStulogin(String loginname, String loginpw) throws Exception {
        TStu tStu = tStuDao.TStulogin(loginname, loginpw);
        return tStu;
    }

    public int TStuAdd(TStu tStu) {
        int i = tStuDao.TStuAdd(tStu);
        return i;
    }

    public int TStuDel(int id) {
        int i = tStuDao.TStuDel(id);
        return i;
    }

    @Override
    public PageInfo<TStu> TStuByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TStu> list = tStuDao.TStuAll();
        for (TStu tStu : list) {
            int banji_id = tStu.getBanji_id();
            TClass tClass = tClassDao.TClassFindbyid(banji_id);
            String name = tClass.getName();
            tStu.setBanji(name);
        }
        PageInfo<TStu> page = new PageInfo<>(list,8);

        return page;
    }

    public List<TStu> TStuAll() {
        List<TStu> tStus = tStuDao.TStuAll();
        for (TStu stus : tStus) {
            System.out.println(stus);
        }
        return tStus;
    }

    public TStu TStuFindbyxuehao(String xuehao) {
        TStu tStu = tStuDao.TStuFindbyxuehao(xuehao);
        return tStu;
    }
}
