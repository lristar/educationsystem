package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TProfession;
import com.lzy.education_system.service.TProfessionService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/admin/tprofession")
public class TAdminTProfessionController {
    @Autowired
    private TProfessionService tProfessionService;

    @RequestMapping("/findshow")
    public PageInfo<TProfession> TProfessionFindBypage(String pageNum, String pageSize){
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);

        PageInfo<TProfession> tProfessionPageInfo = tProfessionService.TProfessionBypage(pagenum, pagesize);
        return tProfessionPageInfo;

    }
    @RequestMapping("/del")
    public ResponseEntity<Map> TProfessiondel(String id){
        int proid = Integer.parseInt(id);
        int i = tProfessionService.TProfessionDel(proid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
    @RequestMapping("/add")
    public ResponseEntity<Map> TProfessionadd(String name,String jieshao){
        String del="no";
        TProfession tProfession = new TProfession(name, jieshao, del);
        int i = tProfessionService.TProfessionAdd(tProfession);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "添加成功", "添加失败");
        return mapResponseEntity;
    }
}
