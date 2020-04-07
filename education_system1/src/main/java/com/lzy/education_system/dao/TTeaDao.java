package com.lzy.education_system.dao;


import com.lzy.education_system.domain.TTea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TTeaDao {
    //老师登录
    TTea TTealogin(@Param("bianhao") String bianhao, @Param("loginpw") String loginpw) throws Exception;

    //添加老师
    int TTeaAdd(@Param("teacher") TTea teacher);

    //删除老师
    int TTeaDel(@Param("id") int id);

    //查询老师信息
    List<TTea> TTeaAll();

    //通过编号查找老师
    TTea TTeaFindbybianhao(@Param("bianhao") String bianhao);

    //通过id查找老师
    TTea TTeaFindbyId(@Param("id") int id);
}
