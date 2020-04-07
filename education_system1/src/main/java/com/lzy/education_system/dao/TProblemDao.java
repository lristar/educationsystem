package com.lzy.education_system.dao;


import com.lzy.education_system.domain.TProblem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface TProblemDao {
    //添加问题
    int TProblemAdd(@Param("tProblem") TProblem tProblem);

    //查看所有问题
    List<TProblem> TProblemFindAll();

    //查找其中一个问题
    TProblem TProblemFindById(@Param("id") int id);

    int TProblemDel(@Param("id") int id);

    //获得对应试题的数目
    int TProblemNumber(@Param("type") int type);
}
