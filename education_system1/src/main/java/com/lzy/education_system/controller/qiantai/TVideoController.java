package com.lzy.education_system.controller.qiantai;

import com.github.pagehelper.PageInfo;

import com.lzy.education_system.domain.TVideo;
import com.lzy.education_system.service.TVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qiantai/vedio")
public class TVideoController {
    @Autowired
    private TVideoService tVideoService;
    @RequestMapping("/findshow")
    public PageInfo<TVideo> TVideoFindBypage(String pageNum,String pageSize){
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TVideo> tVideoPageInfo = tVideoService.TvdieoBypage(pagenum, pagesize);
        return tVideoPageInfo;

    }
}
