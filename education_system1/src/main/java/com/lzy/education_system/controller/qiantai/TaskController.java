package com.lzy.education_system.controller.qiantai;

import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.service.TTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TTaskService tTaskService;

    @RequestMapping("/download")
    public void StuTaskDownload(HttpServletResponse response, String id) throws Exception {
        int taskid = Integer.parseInt(id);
        TTask tTask = tTaskService.TTaskFindOne(taskid);
        String fujianYuanshiming = tTask.getFujianYuanshiming();
        System.out.println(fujianYuanshiming);
        String path = tTask.getFujian();
        System.out.println(path);
        //构建文件对象
        File file = new File(path);

        //设置请求头信息
        // 配置文件下载
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");

        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fujianYuanshiming, "UTF-8"));

        //下载文件

        byte[] buffer = new byte[1024];
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
            System.out.println("successfully");
        } catch (IOException e) {
            System.out.println("failed");
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
