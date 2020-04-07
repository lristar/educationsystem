package com.lzy.education_system.dao;



import com.lzy.education_system.domain.TAnnouncement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TAnnouncementDao {
    //添加公告
    int TAnnounceAdd(@Param("tAnnouncement") TAnnouncement tAnnouncement);

    //删除公告
    int TAnnounceDel(@Param("id") String id);

    //查询所有公告
    List<TAnnouncement> TAnnounceFindAll();

    //查询单个公告
    TAnnouncement TAnnounceFindbyid(@Param("id") int id);

    //查询单个公告通过标题
    TAnnouncement TAnnounceFindbyTitle(@Param("title") String title);

}
