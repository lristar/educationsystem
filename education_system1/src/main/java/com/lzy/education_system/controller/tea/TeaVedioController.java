package com.lzy.education_system.controller.tea;

import com.lzy.education_system.domain.TTask;
import com.lzy.education_system.domain.TVideo;
import com.lzy.education_system.service.TVideoService;
import com.lzy.education_system.utils.DatenowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.soap.Addressing;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/tea/vedio")
public class TeaVedioController {
    @Autowired
    private TVideoService tVideoService;
  @RequestMapping("/upload")
  @ResponseBody
    public String teavedioadd(HttpServletRequest request, MultipartFile vedioupload, String vediotitle,String vediocontent){

//
        TVideo tVideo = new TVideo();
        String originalFilename = vedioupload.getOriginalFilename();
            //获取后缀
            String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
            //保存的文件名
            String dFileName = UUID.randomUUID()+substring;
            //保存路径
            //springboot 默认情况下只能加载 resource文件夹下静态资源文件
            String path = "D:/web file/education_system1/src/main/resources/static/vedio/";
            //生成保存文件
            File uploadFile = new File(path+originalFilename);
            System.out.println(uploadFile);
            //将上传文件保存到路径
            try {
                vedioupload.transferTo(uploadFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(vediotitle);
            System.out.println(path+originalFilename);
            System.out.println(originalFilename);

            tVideo.setTitle(vediotitle);
            tVideo.setContent(vediocontent);
            tVideo.setFujian("/vedio/"+originalFilename);
            tVideo.setFujianYuanshiming(originalFilename);
            DatenowUtils datenowUtils = new DatenowUtils();
            String datenow = datenowUtils.getDatenow();
            tVideo.setShijian(datenow);
            String del="no";
            tVideo.setDel(del);
//            }
            int i = tVideoService.TVideoAdd(tVideo);
            return "i";

    }
}
