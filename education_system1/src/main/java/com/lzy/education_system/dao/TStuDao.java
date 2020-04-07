package com.lzy.education_system.dao;

import com.lzy.education_system.domain.TStu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TStuDao {
    //学生登录
    TStu TStulogin(@Param("xuehao") String xuehao, @Param("loginpw") String loginpw) throws Exception;

    //学生添加
    int TStuAdd(@Param("tStu") TStu tStu);

    //学生删除
    int TStuDel(@Param("id") int id);

    //学生管理
    List<TStu> TStuAll();

    //通过学号查找学生信息
    TStu TStuFindbyxuehao(@Param("xuehao") String xuehao);

    //通过id查找学生信息
    TStu TStuFindbyId(@Param("id") int id);
}
