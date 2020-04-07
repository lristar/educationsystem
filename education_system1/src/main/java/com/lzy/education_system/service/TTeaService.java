package com.lzy.education_system.service;



import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TTea;

import java.util.List;

public interface TTeaService {
    //老师登录
    TTea TTealogin(String loginname, String loginpw) throws Exception;

    //添加老师
    int TTeaAdd(TTea teacher);

    //删除老师
    int TTeaDel(int id);

    //查询老师信息
    List<TTea> TTeaAll();
    //分页查找老师信息
    PageInfo<TTea> TTeaBypage(int pageNum, int pageSize);
    //通过编号查找老师
    TTea TTeaFindbybianhao(String bianhao);
}
