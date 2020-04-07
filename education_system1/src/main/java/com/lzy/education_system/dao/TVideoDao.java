package com.lzy.education_system.dao;



import com.lzy.education_system.domain.TVideo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TVideoDao {
    //视频添加
    int TVideoAdd(@Param("tVideo") TVideo tVideo);

    //视频删除
    int TVideoDel(@Param("id") int id);

    //单个视频查看
    TVideo TVideoFindbyid(@Param("id") int id);

    //查看所有视频
    List<TVideo> TVideoFindAll();


}
