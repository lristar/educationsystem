package com.lzy.education_system.service.lmpl;

import com.lzy.education_system.dao.TAdminDao;
import com.lzy.education_system.domain.TAdmin;
import com.lzy.education_system.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAdminServicelmpl implements TAdminService {
    @Autowired
    private TAdminDao tAdminDao;


    public TAdmin TadminLogin(String userName, String userPw) throws Exception {
        TAdmin tAdmin = tAdminDao.TadminLogin(userName,userPw);
        if(tAdmin!=null){
            return tAdmin;
        }
            return null;
    }


    public List<TAdmin> TadminAll() {
        List<TAdmin> tAdmins = tAdminDao.TadminAll();
        return tAdmins;
    }

    public int TadminAdd(String userName, String userPw)throws Exception{
        int i = tAdminDao.TadminAdd(userName, userPw);
        return i;
    }

    public int TadminDel(int userId) {
        int i = tAdminDao.TadminDel(userId);
        return i;
    }

    public int TAdminPwEdit(String userPwNew,String userName) {
        int i = tAdminDao.TAdminPwEdit(userPwNew,userName);
        return i;
    }


}
