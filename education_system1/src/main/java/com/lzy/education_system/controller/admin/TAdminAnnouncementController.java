package com.lzy.education_system.controller.admin;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TAnnouncement;
import com.lzy.education_system.service.TAnnouncementService;
import com.lzy.education_system.utils.CRUtils;
import com.lzy.education_system.utils.DatenowUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

//后台控制
@RestController
@RequestMapping("/admin/announcement")
public class TAdminAnnouncementController {
    @Autowired
    private TAnnouncementService tAnnouncementService;

    //管理员添加公告
    @RequestMapping("/add")
    public ResponseEntity<Map> AnnounceAdd(String title,String content) {
        TAnnouncement tAnnouncement = new TAnnouncement();
        DatenowUtils datenowUtils = new DatenowUtils();
        String nowtime = datenowUtils.getDatenow();
        tAnnouncement.setTitle(title);
        tAnnouncement.setContent(content);
        tAnnouncement.setShijian(nowtime);
        int i = tAnnouncementService.TAnnounceAdd(tAnnouncement);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "添加成功", "添加失败");
        return mapResponseEntity;
    }
    //管理员删除公告
    @RequestMapping("/del")
    public ResponseEntity<Map> AnnounceDel(HttpServletRequest request){
        String id = request.getParameter("id");
        int i = tAnnouncementService.TAnnounceDel(id);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(1, "删除成功", "删除失败");
        return mapResponseEntity;

    }
    //管理员管理公告
    @RequestMapping("/findshow")
    public PageInfo<TAnnouncement> AnnounceShow(HttpServletRequest request, String pageNum, String pageSize){
        //当前页码
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);
        //获得当前页码的page相关值
        PageInfo<TAnnouncement> pageInfo = tAnnouncementService.TAnnounceFindBypage(pagenum, pagesize);
       return pageInfo;
    }
}