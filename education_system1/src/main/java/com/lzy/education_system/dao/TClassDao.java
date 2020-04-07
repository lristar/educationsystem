package com.lzy.education_system.dao;


import com.lzy.education_system.domain.TClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface TClassDao {
    //班级添加
    int TClassAdd(@Param("tClass") TClass tClass);

    //班级删除
    int TClassDel(@Param("id") int id);

    //班级分组通过专业
    List<TClass> TClassOrderByzhuanye_id();

    //获得单个班级信息
    TClass TClassFindbyid(@Param("id") int id);

    //获得单个班级信息
    TClass TClassFindbyName(@Param("name") String name);

    //获取所有班级信息
    List<TClass> TClassAll();


}
