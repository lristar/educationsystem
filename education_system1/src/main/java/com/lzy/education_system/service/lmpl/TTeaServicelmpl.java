package com.lzy.education_system.service.lmpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TTeaDao;
import com.lzy.education_system.domain.TTea;
import com.lzy.education_system.service.TTeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTeaServicelmpl implements TTeaService {
    @Autowired
    private TTeaDao tTeaDao;
    public TTea TTealogin(String loginname, String loginpw) throws Exception {
        TTea tea = tTeaDao.TTealogin(loginname, loginpw);
        return tea;
    }

    public int TTeaAdd(TTea teacher) {
        int i = tTeaDao.TTeaAdd(teacher);
        return i;
    }

    public int TTeaDel(int id) {
        int i = tTeaDao.TTeaDel(id);
        return i;
    }

    public List<TTea> TTeaAll() {
        List<TTea> tTeas = tTeaDao.TTeaAll();
        return tTeas;
    }

    @Override
    public PageInfo<TTea> TTeaBypage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TTea> list = tTeaDao.TTeaAll();
        PageInfo<TTea> page = new PageInfo<>(list, 8);
        return page;
    }

    public TTea TTeaFindbybianhao(String bianhao) {
        TTea tTea = tTeaDao.TTeaFindbybianhao(bianhao);
        return tTea;
    }
}
