package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.dao.TAnnouncementDao;
import com.lzy.education_system.domain.EasyUIDataGridEesult;
import com.lzy.education_system.domain.TAnnouncement;
import com.lzy.education_system.service.TAnnouncementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAnnouncementServicelmpl implements TAnnouncementService {
    @Autowired
    private TAnnouncementDao tAnnouncementDao;

    public int TAnnounceAdd(TAnnouncement tAnnouncement) {
        int i = tAnnouncementDao.TAnnounceAdd(tAnnouncement);
        return i;
    }

    public int TAnnounceDel(String id) {
        int i = tAnnouncementDao.TAnnounceDel(id);
        return i;
    }

    public List<TAnnouncement> TAnnounceFindAll() {

        List<TAnnouncement> tAnnouncements = tAnnouncementDao.TAnnounceFindAll();
        return tAnnouncements;
    }

    public PageInfo<TAnnouncement> TAnnounceFindBypage(Integer startpage, Integer pagesize) {
        PageHelper.startPage(startpage,pagesize);
        List<TAnnouncement> list = tAnnouncementDao.TAnnounceFindAll();
        EasyUIDataGridEesult result = new EasyUIDataGridEesult();
        result.setRows(list);
        PageInfo<TAnnouncement> Info = new PageInfo<TAnnouncement>(list,8);


        return Info;
    }

    public TAnnouncement TAnnounceFindbyid(int id) {
        TAnnouncement tAnnouncement = tAnnouncementDao.TAnnounceFindbyid(id);
        return tAnnouncement;
    }

    public TAnnouncement TAnnounceFindbyTitle(String title) {
        TAnnouncement tAnnouncement = tAnnouncementDao.TAnnounceFindbyTitle(title);
        return tAnnouncement;
    }

}
