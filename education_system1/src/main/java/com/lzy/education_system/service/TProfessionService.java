package com.lzy.education_system.service;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TProfession;

import java.util.List;

public interface TProfessionService {
    //添加专业
    int TProfessionAdd(TProfession tProfession);

    //删除专业
    int TProfessionDel(int id);

    //获取单个专业的信息
    TProfession TProfessionFindbyid(int id);

    //获取所有专业的信息
    List<TProfession> TProfessionFindAll();
    //分页查看专业信息
    PageInfo<TProfession> TProfessionBypage(int pageNum, int pageSize);

    //获取单个专业的信息（专业名)
    TProfession TProfessionFindbyname(String name);
}
