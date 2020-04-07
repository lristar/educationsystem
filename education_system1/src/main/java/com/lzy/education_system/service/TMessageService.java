package com.lzy.education_system.service;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TMessage;

import java.util.List;

public interface TMessageService {
    //添加留言
    int TMessageAdd(TMessage tMessage);

    //查询所有留言
    List<TMessage> TMessageFindAll();

    //删除留言
    int TMessageDel(String id);
    //分页查询留言信息
    PageInfo<TMessage> TMessageFindBypage(int pageNum, int pageSize);
}
