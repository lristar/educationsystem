package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TProblem;
import com.lzy.education_system.service.TProblemService;
import com.lzy.education_system.utils.CRUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/problem")
public class TAdminProblemController {
    @Autowired
    private TProblemService tProblemService;

    @RequestMapping("/findshowall")
    public List<TProblem> TProblemshowall(){
        List<TProblem> tProblems = tProblemService.TProblemFindAll();
        return tProblems;
    }
    @RequestMapping("/del")
    public ResponseEntity<Map> Tproblemdel(String id){
        int problemid = Integer.parseInt(id);
        int i = tProblemService.TProblemDel(problemid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
}
