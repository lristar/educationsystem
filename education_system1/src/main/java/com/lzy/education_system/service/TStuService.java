package com.lzy.education_system.service;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TStu;

import java.util.List;

public interface TStuService {
    //学生登录
    TStu TStulogin(String loginname, String loginpw) throws Exception;

    //学生添加
    int TStuAdd(TStu tStu);

    //学生删除
    int TStuDel(int id);

    //分页查看学生信息
    PageInfo<TStu> TStuByPage(int pageNum, int pageSize);
    //学生管理
    List<TStu> TStuAll();

    //通过学号查找学生信息
    TStu TStuFindbyxuehao(String xuehao);
}
