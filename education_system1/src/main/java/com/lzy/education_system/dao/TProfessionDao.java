package com.lzy.education_system.dao;

import com.lzy.education_system.domain.TProfession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TProfessionDao {
    //添加专业
    int TProfessionAdd(@Param("tProfession") TProfession tProfession);

    //删除专业
    int TProfessionDel(@Param("id") int id);

    //获取单个专业的信息
    TProfession TProfessionFindbyid(@Param("id") int id);

    //获取所有专业的信息
    List<TProfession> TProfessionFindAll();

    //获取单个专业的信息（专业名)
    TProfession TProfessionFindbyname(@Param("name") String name);
}
