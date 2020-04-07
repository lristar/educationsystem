package com.lzy.education_system.service.lmpl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.dao.TMessageDao;
import com.lzy.education_system.dao.TStuDao;
import com.lzy.education_system.dao.TTeaDao;
import com.lzy.education_system.domain.TMessage;
import com.lzy.education_system.domain.TStu;
import com.lzy.education_system.domain.TTea;
import com.lzy.education_system.service.TMessageService;
import com.lzy.education_system.service.TStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TMessageServicelmpl implements TMessageService {
    @Autowired
    private TMessageDao tMessageDao;
    @Autowired
    private TStuDao tStuDao;
    @Autowired
    private TTeaDao tTeaDao;




    public int TMessageAdd(TMessage tMessage) {
        int i = tMessageDao.TMessageAdd(tMessage);
        return i;
    }

    public List<TMessage> TMessageFindAll() {
        List<TMessage> tMessages = tMessageDao.TMessageFindAll();
        return tMessages;
    }

    public int TMessageDel(String id) {
        int i = tMessageDao.TMessageDel(id);
        return i;
    }

    @Override
    public PageInfo<TMessage> TMessageFindBypage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TMessage> tMessages = tMessageDao.TMessageFindAll();
        for (TMessage tMessage : tMessages) {
            int user_id = tMessage.getUser_id();
            int type = tMessage.getType();
            if(type==1){
                TTea tTea = tTeaDao.TTeaFindbyId(user_id);
                String name = tTea.getName();
                tMessage.setUser_name(name);
            }
            else{
                TStu tStu = tStuDao.TStuFindbyId(user_id);
                String name = tStu.getName();
                tMessage.setUser_name(name);
            }

        }
        PageInfo<TMessage> info = new PageInfo<>(tMessages, 8);
        return info;
    }
}
