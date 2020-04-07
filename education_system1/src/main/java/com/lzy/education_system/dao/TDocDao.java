package com.lzy.education_system.dao;

import com.lzy.education_system.domain.TDoc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface TDocDao {
    //添加文档
    int TDocAdd(@Param("tDoc") TDoc tDoc);

    //删除文档
    int TDocDel(@Param("id") String id);

    //查询单个文档信息
    TDoc TDocFindbyid(@Param("id") String id);
    //查询所有文档信息
    List<TDoc> TDocFindAll();

}
