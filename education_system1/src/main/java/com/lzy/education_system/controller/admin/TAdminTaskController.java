package com.lzy.education_system.controller.admin;

import com.github.pagehelper.PageInfo;
import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.service.TTaskService;
import com.lzy.education_system.service.TTeaService;
import com.lzy.education_system.utils.CRUtils;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/admin/task")
public class TAdminTaskController {
    @Autowired
    private TTaskService tTaskService;
    @RequestMapping("/findshow")
    public PageInfo<TTask> taskFindshow(String pageNum,String pageSize){
        int pagenum = Integer.parseInt(pageNum);
        int pagesize = Integer.parseInt(pageSize);
        PageInfo<TTask> tTaskPageInfo = tTaskService.TTaskBypage(pagenum, pagesize);
        return tTaskPageInfo;
    }

    @RequestMapping("/del")
    public ResponseEntity<Map> admintaskdel(String id){
        int taskid = Integer.parseInt(id);

        int i = tTaskService.TTaskDel(taskid);
        CRUtils crUtils = new CRUtils();
        ResponseEntity<Map> mapResponseEntity = crUtils.CRUtils(i, "删除成功", "删除失败");
        return mapResponseEntity;
    }
}
