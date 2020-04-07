package com.lzy.education_system.service;


import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TDoc;

import java.util.List;

public interface TDocService {
    //添加文档
    int TDocAdd(TDoc tDoc);

    //删除文档
    int TDocDel(String id);

    //查询单个文档信息
    TDoc TDocFindbyid(String id);
    //分页查询文档信息
    PageInfo<TDoc> TDocFindBypage(int pageNum, int pageSize);
    //查询所有文档信息
    List<TDoc> TDocFindAll();
}
