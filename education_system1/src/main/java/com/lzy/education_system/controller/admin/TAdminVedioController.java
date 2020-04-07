package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TVideo;
import com.lzy.education_system.service.TVideoService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/admin/vedio")
@RestController
public class TAdminVedioController {
    @Autowired
    private TVideoService tVideoService;
    @RequestMapping("/findshow")
    public PageInfo<TVideo> adminVedio(String pageNum,String pageSize){
        int pagenum = Integer.parseInt(pageNum);
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TVideo> tVideoPageInfo = tVideoService.TvdieoBypage(pagenum, pagesize);
        return tVideoPageInfo;
    }
    @RequestMapping("/del")
    public ResponseEntity<Map> adminVediodel(String id){
        int vedioid = Integer.parseInt(id);
        int i = tVideoService.TVideoDel(vedioid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
}
