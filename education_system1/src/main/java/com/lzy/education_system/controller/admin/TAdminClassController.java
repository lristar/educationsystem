package com.lzy.education_system.controller.admin;
import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TClass;
import com.lzy.education_system.domain.TProfession;
import com.lzy.education_system.service.TClassService;
import com.lzy.education_system.service.TProfessionService;

import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

//管理员操作class
@RestController
@RequestMapping("/admin/class")
public class TAdminClassController {
    @Autowired
    private TClassService tClassService;
   @Autowired
    private TProfessionService tProfessionService;
    @RequestMapping("/add")
    public ResponseEntity<Map> ClassAdd(String name,String zhuanye){
        String del= "no";
        TProfession tProfession = tProfessionService.TProfessionFindbyname(zhuanye);
        int zhuanye_id = tProfession.getId();
        TClass tClass = new TClass();
        tClass.setName(name);
        tClass.setZhuanye_id(zhuanye_id);
        tClass.setDel(del);
        int i = tClassService.TClassAdd(tClass);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "添加成功", "删除成功");
        return mapResponseEntity;

    }
    @RequestMapping("/del")
    public ResponseEntity<Map> ClassDel(HttpServletRequest request){
        String id = request.getParameter("id");
        int classid = Integer.parseInt(id);
        int i = tClassService.TClassDel(classid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;

    }
    @RequestMapping("/findshow")
    public PageInfo<TClass> ClassFindBypage(String pageNum,String pageSize){
        int pagenum = Integer.parseInt(pageNum);
//        每一页的数据数
        int pagesize = Integer.parseInt(pageSize);

        PageInfo<TClass> tClassPageInfo = tClassService.TClassBypage(pagenum, pagesize);
        return tClassPageInfo;
    }


}
