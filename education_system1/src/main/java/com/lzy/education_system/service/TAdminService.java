package com.lzy.education_system.service;

import com.lzy.education_system.domain.TAdmin;

import java.util.List;

public interface TAdminService {
    //管理员登录
    TAdmin TadminLogin(String userName, String userPw) throws Exception;

    //管理员信息查询
    List<TAdmin> TadminAll();

    //管理员添加
    int TadminAdd(String userName, String userPw) throws Exception;

    //管理员删除
    int TadminDel(int userId);

    //管理员密码修改
    int TAdminPwEdit(String userPwNew, String userName);
}
