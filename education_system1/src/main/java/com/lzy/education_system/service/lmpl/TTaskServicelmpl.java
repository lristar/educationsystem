package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TTaskDao;
import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.service.TTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTaskServicelmpl implements TTaskService {
    @Autowired
    private TTaskDao tTaskDao;
    public int TTaskAdd(TTask tTask) {
        int i = tTaskDao.TTaskAdd(tTask);
        return i;
    }

    public int TTaskDel(int id) {
        int i = tTaskDao.TTaskDel(id);
        return i;
    }

    public List<TTask> TTaskFindAll() {
        List<TTask> tTasks = tTaskDao.TTaskFindAll();

        return tTasks;
    }

    @Override
    public PageInfo<TTask> TTaskBypage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TTask> tTasks = tTaskDao.TTaskFindAll();
        PageInfo<TTask> page = new PageInfo<>(tTasks, 8);
        return page;
    }


    public TTask TTaskFindOne(int id) {
        TTask tTask = tTaskDao.TTaskFindOne(id);
        return tTask;
    }
}
