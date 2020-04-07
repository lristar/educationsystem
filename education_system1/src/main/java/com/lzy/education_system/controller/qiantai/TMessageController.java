package com.lzy.education_system.controller.qiantai;

import com.github.pagehelper.PageInfo;

import com.lzy.education_system.domain.TMessage;
import com.lzy.education_system.service.TMessageService;
import com.lzy.education_system.utils.CRUtils;
import com.lzy.education_system.utils.DatenowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/qiantai/mes")
public class TMessageController {
    @Autowired
    private TMessageService tMessageService;

    @RequestMapping("/findshow")
    @ResponseBody
    public PageInfo<TMessage> TAdminMesFindBypage(String pageNum, String pageSize) {
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);

        PageInfo<TMessage> tMessagePageInfo = tMessageService.TMessageFindBypage(pagenum, pagesize);
        return tMessagePageInfo;
    }

    @RequestMapping("/add")
    public ResponseEntity<Map> TstuMesAdd(String title,String content,String id,String type) {
        DatenowUtils datenowUtils = new DatenowUtils();
        String datenow = datenowUtils.getDatenow();

        int userId = Integer.parseInt(id);
        int usertype = Integer.parseInt(type);
        TMessage tMessage = new TMessage(title, content, datenow, userId,usertype);
        int i = tMessageService.TMessageAdd(tMessage);

        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "发表成功", "发表失败");
        return mapResponseEntity;
    }
}
