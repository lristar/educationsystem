package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TDocDao;
import com.lzy.education_system.domain.TDoc;
import com.lzy.education_system.service.TDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDocServicelmpl implements TDocService {
    @Autowired
    private TDocDao tDocDao;

    public int TDocAdd(TDoc tDoc) {
        int i = tDocDao.TDocAdd(tDoc);
        return i;
    }

    public int TDocDel(String id) {
        int i = tDocDao.TDocDel(id);
        return i;
    }

    public TDoc TDocFindbyid(String id) {
        TDoc tDoc = tDocDao.TDocFindbyid(id);
        return tDoc;
    }

    @Override
    public PageInfo<TDoc> TDocFindBypage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TDoc> tDocs = tDocDao.TDocFindAll();
        PageInfo<TDoc> info = new PageInfo<>(tDocs, 8);
        return info;
    }

    public List<TDoc> TDocFindAll() {
        List<TDoc> tDocs = tDocDao.TDocFindAll();
        return tDocs;
    }
}
