package com.lzy.education_system.utils;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class FileUtils {

    /**
     * 上传文件
     * @param file
     * @return
     */
    public static String uploadFile(MultipartFile file) throws IOException{
        String uuid = UUID.randomUUID().toString();
        String filename = file.getOriginalFilename();
        String ext = filename.substring(filename.lastIndexOf('.')+1);
        InputStream inputStream = file.getInputStream();
        String path = "D:\\web所需框架\\nginx-1.13.8\\html\\task\\"+uuid+'.'+ext;
        OutputStream outputStream = new FileOutputStream(path);
        IOUtils.copy(inputStream,outputStream);
        return "http://localhost/task/"+uuid+'.'+ext;
    }
}
