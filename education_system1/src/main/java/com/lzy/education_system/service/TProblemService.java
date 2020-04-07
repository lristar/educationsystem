package com.lzy.education_system.service;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TProblem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TProblemService {
    //添加问题
    int TProblemAdd(TProblem tProblem);

    //查看所有问题
    List<TProblem> TProblemFindAll();

    //查找其中一个问题
    TProblem TProblemFindById(int id);

    //删除其中的问题

    int TProblemDel(int id);
    //分页查看问题

    int TProblemNumber(@Param("type") int type);
}
