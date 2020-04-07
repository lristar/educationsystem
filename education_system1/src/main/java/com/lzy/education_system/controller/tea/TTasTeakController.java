package com.lzy.education_system.controller.tea;

import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.service.TTaskService;
import com.lzy.education_system.utils.CRUtils;
import com.lzy.education_system.utils.DatenowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

//老师上传作业
@RestController
@RequestMapping("/tea/task")
public class TTasTeakController {
    @Autowired
    private TTaskService tTaskService;
    @RequestMapping("/upload")
    @ResponseBody
    public String teauploadtask(HttpServletRequest request,MultipartFile taskupload, String tasktitle) throws IOException {
//
        TTask tTask = new TTask();
        String originalFilename = taskupload.getOriginalFilename();
        //获取后缀
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        //保存的文件名
        String dFileName = UUID.randomUUID()+substring;
        //保存路径
        //springboot 默认情况下只能加载 resource文件夹下静态资源文件
        String path = "D:/web file/education_system1/src/main/resources/static/upload/";
        //生成保存文件
        File uploadFile = new File(path+originalFilename);
        //将上传文件保存到路径
        try {
            taskupload.transferTo(uploadFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        tTask.setMingcheng(tasktitle);
                tTask.setFujian(path+originalFilename);
                tTask.setFujianYuanshiming(originalFilename);
                DatenowUtils datenowUtils = new DatenowUtils();
                String datenow = datenowUtils.getDatenow();
                tTask.setShijian(datenow);
                String del="no";
                tTask.setDel(del);
//            }
          int i = tTaskService.TTaskAdd(tTask);
        return "i";
    }
}
