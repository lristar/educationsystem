package com.lzy.education_system.service.lmpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lzy.education_system.dao.TVideoDao;
import com.lzy.education_system.domain.TVideo;
import com.lzy.education_system.service.TVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVideoServicelmpl implements TVideoService {
    @Autowired
    private TVideoDao tVideoDao;
    public int TVideoAdd(TVideo tVideo) {
        int i = tVideoDao.TVideoAdd(tVideo);
        return i;
    }

    public int TVideoDel(int id) {
        int i = tVideoDao.TVideoDel(id);
        return i;
    }

    public TVideo TVideoFindbyid(int id) {
        TVideo tVideo = tVideoDao.TVideoFindbyid(id);
        return tVideo;
    }

    public List<TVideo> TVideoFindAll() {
        List<TVideo> tVideos = tVideoDao.TVideoFindAll();
        return tVideos;
    }

    @Override
    public PageInfo<TVideo> TvdieoBypage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TVideo> list = tVideoDao.TVideoFindAll();
        PageInfo<TVideo> page = new PageInfo<>(list, 8);
        return page;
    }
}
