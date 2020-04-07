package com.lzy.education_system.service;


import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TVideo;

import java.util.List;

public interface TVideoService {
    //视频添加
    int TVideoAdd(TVideo tVideo);

    //视频删除
    int TVideoDel(int id);

    //单个视频查看
    TVideo TVideoFindbyid(int id);

    //查看所有视频
    List<TVideo> TVideoFindAll();
    //分页查找视频
    PageInfo<TVideo> TvdieoBypage(int pageNum, int pageSize);
}
