package com.lzy.education_system.dao;

import com.lzy.education_system.domain.TMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TMessageDao {
    //添加留言
    int TMessageAdd(@Param("tMessage") TMessage tMessage);

    //查询所有留言
    List<TMessage> TMessageFindAll();

    //删除留言
    int TMessageDel(@Param("id") String id);


}
