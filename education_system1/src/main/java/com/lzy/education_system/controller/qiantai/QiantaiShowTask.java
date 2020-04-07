package com.lzy.education_system.controller.qiantai;

import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.service.TTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qiantai/task")
public class QiantaiShowTask {
    @Autowired
    private TTaskService tTaskService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ResponseEntity<List<TTask>> showTask( ){
        List<TTask> tTasks = tTaskService.TTaskFindAll();
        return ResponseEntity.ok(tTasks);
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
