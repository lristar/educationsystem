package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TProfessionDao;
import com.lzy.education_system.domain.TProfession;
import com.lzy.education_system.service.TProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TProfessionServicelmpl implements TProfessionService {
    @Autowired
    private TProfessionDao tProfessionDao;


    public int TProfessionAdd(TProfession tProfession) {
        int i = tProfessionDao.TProfessionAdd(tProfession);
        return i;
    }

    public int TProfessionDel(int id) {
        int i = tProfessionDao.TProfessionDel(id);
        return i;
    }

    public TProfession TProfessionFindbyid(int id) {
        TProfession tProfession = tProfessionDao.TProfessionFindbyid(id);
        return tProfession;
    }

    public List<TProfession> TProfessionFindAll() {
        List<TProfession> tProfessions = tProfessionDao.TProfessionFindAll();
        return tProfessions;
    }

    @Override
    public PageInfo<TProfession> TProfessionBypage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TProfession> list = tProfessionDao.TProfessionFindAll();
        PageInfo<TProfession> page = new PageInfo<>(list, 8);
        return page;
    }

    public TProfession TProfessionFindbyname(String name) {
        TProfession tProfession = tProfessionDao.TProfessionFindbyname(name);
        return tProfession;
    }
}
