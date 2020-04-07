package com.lzy.education_system.service;



import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TAnnouncement;

import java.util.List;

public interface TAnnouncementService {
    //添加公告
    int TAnnounceAdd(TAnnouncement tAnnouncement);

    //删除公告
    int TAnnounceDel(String id);

    //查询所有公告
    List<TAnnouncement> TAnnounceFindAll();

    //分页查询公告
    PageInfo<TAnnouncement> TAnnounceFindBypage(Integer startpage, Integer pagesize);

    //查询单个公告
    TAnnouncement TAnnounceFindbyid(int id);

    //查询单个公告通过标题
    TAnnouncement TAnnounceFindbyTitle(String title);


}
