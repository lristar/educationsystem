package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.dao.TProblemDao;
import com.lzy.education_system.domain.TProblem;
import com.lzy.education_system.service.TProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TProblemServicelmpl implements TProblemService {
    @Autowired
    private TProblemDao tProblemDao;
    public int TProblemAdd(TProblem tProblem) {
        int i = tProblemDao.TProblemAdd(tProblem);
        return i;
    }

    public List<TProblem> TProblemFindAll() {
        List<TProblem> tProblems = tProblemDao.TProblemFindAll();
        return tProblems;
    }

    public TProblem TProblemFindById(int id) {
        TProblem tProblem = tProblemDao.TProblemFindById(id);
        return tProblem;
    }

    @Override
    public int TProblemDel(int id) {
        int i = tProblemDao.TProblemDel(id);
        return i;
    }



    @Override
    public int TProblemNumber(int type) {
        int i = tProblemDao.TProblemNumber(type);
        return i;
    }
}
