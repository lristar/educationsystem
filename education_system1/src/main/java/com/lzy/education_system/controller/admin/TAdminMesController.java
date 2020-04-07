package com.lzy.education_system.controller.admin;


import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TMessage;
import com.lzy.education_system.service.TMessageService;
import com.lzy.education_system.utils.CRUtils;
import com.lzy.education_system.utils.DatenowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/admin/message")
public class  TAdminMesController {
    @Autowired
    private TMessageService tMessageService;


    @RequestMapping("/del")
    public ResponseEntity<Map> TAdminMesDel(String id){
        int i = tMessageService.TMessageDel(id);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
    @RequestMapping("/findshow")
    public PageInfo<TMessage>TAdminMesShow(String pageNum,String pageSize){
        int pagenum = Integer.parseInt(pageNum);
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TMessage> tMessagePageInfo = tMessageService.TMessageFindBypage(pagenum, pagesize);
        return tMessagePageInfo;
    }

}
