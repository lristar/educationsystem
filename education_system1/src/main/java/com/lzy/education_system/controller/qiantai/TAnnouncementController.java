package com.lzy.education_system.controller.qiantai;

import com.lzy.education_system.domain.TAnnouncement;
import com.lzy.education_system.service.TAnnouncementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/qiantai/Tannounce")
public class TAnnouncementController {
    @Autowired
    private TAnnouncementService tAnnouncementService;
    //获得公告的名字
    public String TAnnounceAllName(Model model)
    {
        List<TAnnouncement> tAnnouncements = tAnnouncementService.TAnnounceFindAll();
        List<String> name=null;
        for (TAnnouncement tAnnouncement : tAnnouncements) {
            String title = tAnnouncement.getTitle();
            name.add(title);
        }
        model.addAttribute("tAnnouncementname",name);
        return "index.jsp";
    }
    //获得公告的内容
    public String TAnnounceFindOneContent(HttpServletRequest request, Model model){
        String tAnnouncementname = request.getParameter("tAnnouncementname");

        TAnnouncement tAnnouncement = tAnnouncementService.TAnnounceFindbyTitle(tAnnouncementname);
        String content = tAnnouncement.getContent();
        model.addAttribute("announceContent",content);
        return "announceContent.jsp";

    }
    //
}
