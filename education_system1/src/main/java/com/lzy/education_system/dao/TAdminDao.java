package com.lzy.education_system.dao;


import com.lzy.education_system.domain.TAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TAdminDao {
    TAdmin TadminFindone(@Param("userName") String userName);

    //管理员登录
    TAdmin TadminLogin(@Param("userName") String userName, @Param("userPw") String userPw) throws Exception;

    //管理员信息查询
    List<TAdmin> TadminAll();

    //管理员添加
    int TadminAdd(@Param("userName") String userName, @Param("userPw") String userPw);

    //管理员删除
    int TadminDel(@Param("userId") int userId);

    //管理员密码修改
    int TAdminPwEdit(@Param("userPwNew") String userPwNew, @Param("userName") String userName);
}
