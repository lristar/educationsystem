package com.lzy.education_system.controller.qiantai;

import com.github.pagehelper.PageInfo;

import com.lzy.education_system.domain.TDoc;
import com.lzy.education_system.service.TDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qiantai/doc")
public class TDocController {
    @Autowired
    private TDocService tDocService;

    public PageInfo<TDoc> TDocFindBypage(String pageNum, String pageSize){
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TDoc> tDocPageInfo = tDocService.TDocFindBypage(pagenum, pagesize);
        return tDocPageInfo;

    }
}
