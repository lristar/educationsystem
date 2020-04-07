package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;

import com.lzy.education_system.domain.TTea;
import com.lzy.education_system.service.TTeaService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/tea")
public class TAdminTeaController {
    @Autowired
    private TTeaService tTeaService;
    @RequestMapping("/add")
    public ResponseEntity<Map> adminteaAdd(String bianhao,String name,String sex,String age,String loginpw) {
        int teaage = Integer.parseInt(age);
        int type=1;
        String del = "no";
        TTea tTea = new TTea(bianhao, name, sex,type, teaage, del,loginpw);
        int i = tTeaService.TTeaAdd(tTea);
        Map<String, Object> map = new HashMap<>();
        if (i > 0) {
            map.put("msg","添加成功");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        } else {
            map.put("msg","添加失败");
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }

    }

    @RequestMapping("/del")
    public ResponseEntity<Map> adminteaDel(HttpServletRequest request,String id) {
        int teaid = Integer.parseInt(id);
        int i = tTeaService.TTeaDel(teaid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
    //老师信息查看
    @RequestMapping(value = "/findshow")
    public PageInfo<TTea> TAdminFindBypage(String pageNum,String pageSize){
        //当前页码
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TTea> Info = tTeaService.TTeaBypage(pagenum, pagesize);

        return Info;
    }
}