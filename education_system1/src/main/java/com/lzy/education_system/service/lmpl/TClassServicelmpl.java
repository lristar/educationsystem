package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.dao.TClassDao;
import com.lzy.education_system.dao.TProblemDao;
import com.lzy.education_system.dao.TProfessionDao;
import com.lzy.education_system.domain.TClass;
import com.lzy.education_system.domain.TProfession;
import com.lzy.education_system.service.TClassService;

import com.lzy.education_system.service.TProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TClassServicelmpl implements TClassService {
    @Autowired
    private TClassDao tClassDao;
    @Autowired
    private TProfessionDao tProfessionDao;

    public int TClassAdd(TClass tClass) {
        int i = tClassDao.TClassAdd(tClass);
        return i;
    }

    public int TClassDel(int id) {
        int i = tClassDao.TClassDel(id);
        return i;
    }

    public List<TClass> TClassOrderByzhuanye_id() {
        List<TClass> tClasses = tClassDao.TClassOrderByzhuanye_id();
        return tClasses;
    }

    public TClass TClassFindbyid(int id) {
        TClass tClass = tClassDao.TClassFindbyid(id);
        return tClass;
    }

    public List<TClass> TClassAll() {
        List<TClass> tClasses = tClassDao.TClassAll();
        return tClasses;
    }

    @Override
    public PageInfo<TClass> TClassBypage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TClass> tClasses = tClassDao.TClassAll();
        //获取zhuanyeid对应的专业名称
        for (TClass tClass : tClasses) {
            int zhuanye_id = tClass.getZhuanye_id();
            TProfession tProfession = tProfessionDao.TProfessionFindbyid(zhuanye_id);
            String name = tProfession.getName();
            tClass.setZhuanye_name(name);
        }
        PageInfo<TClass> info = new PageInfo<>(tClasses, 8);
        return info;
    }

    public TClass TClassFindbyName(String name) {
        return this.tClassDao.TClassFindbyName(name);
    }
}
