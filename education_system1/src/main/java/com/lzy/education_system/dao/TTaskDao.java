package com.lzy.education_system.dao;

import com.lzy.education_system.domain.TTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TTaskDao {
    //作业添加
    int TTaskAdd(@Param("tTask") TTask tTask);

    //作业删除
    int TTaskDel(@Param("id") int id);

    //查询所有作业
    List<TTask> TTaskFindAll();

    //查询单个作业
    TTask TTaskFindOne(@Param("id") int id);
}
