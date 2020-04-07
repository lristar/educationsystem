package com.lzy.education_system.service;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TClass;

import java.util.List;

public interface TClassService {
    //班级添加
    int TClassAdd(TClass tClass);

    //班级删除
    int TClassDel(int id);

    //班级分组通过专业
    List<TClass> TClassOrderByzhuanye_id();

    //获得单个班级信息
    TClass TClassFindbyid(int id);

    //获取所有班级信息
    List<TClass> TClassAll();

    //分页获得班级信息
    PageInfo<TClass> TClassBypage(int pageNum, int pageSize);

    //获得单个班级信息
    TClass TClassFindbyName(String name);

}
