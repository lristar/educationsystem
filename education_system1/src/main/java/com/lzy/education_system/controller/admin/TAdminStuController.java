package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TClass;
import com.lzy.education_system.domain.TStu;
import com.lzy.education_system.service.TClassService;
import com.lzy.education_system.service.TStuService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/admin/stu")
public class TAdminStuController {
    @Autowired
    private TStuService tStuService;
    @Autowired
    private TClassService tClassService;

    //管理员添加学生
    @RequestMapping("/add")
    @ResponseBody
    public ResponseEntity<Map> TadminStuAdd(String xuehao,String name,String sex,String ages,String banji,String ruxueshijian,String loginpw) {

        int age = Integer.parseInt(ages);

        TClass tClass = tClassService.TClassFindbyName(banji);
        int id = tClass.getId();
        int type=2;
        String del = "no";
//        new TStu("2019001", "王涛", "男", 23, 1, "2016-09-01", "no", "000000")
        TStu tStu = new TStu(xuehao, name, sex, age,type, id, ruxueshijian, del,loginpw);
        int i = tStuService.TStuAdd(tStu);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "添加成功", "添加失败");
        return mapResponseEntity;


    }

    //管理员删除学生
    @RequestMapping("/del")
    public ResponseEntity<Map> TAdminDelstu(String id) {
        int stuid = Integer.parseInt(id);
        int i = tStuService.TStuDel(stuid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;

    }

    //学生信息查看
    @RequestMapping("/findshow")
    @ResponseBody
    public PageInfo<TStu> TAdminFindAll(String pageNum, String pageSize) {
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TStu> info = tStuService.TStuByPage(pagenum, pagesize);
        return info;

    }
}