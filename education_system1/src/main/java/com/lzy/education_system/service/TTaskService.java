package com.lzy.education_system.service;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TTask;

import java.util.List;

public interface TTaskService {
    //作业添加
    int TTaskAdd(TTask tTask);

    //作业删除
    int TTaskDel(int id);
    //查询所有作业
    List<TTask> TTaskFindAll();
    //分页查询作业
    PageInfo<TTask> TTaskBypage(int pageNum, int pageSize);
    //查询单个作业
    TTask TTaskFindOne(int id);
}
