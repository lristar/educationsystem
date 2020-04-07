package com.lzy.education_system.controller.qiantai;

import com.lzy.education_system.domain.TVideo;
import com.lzy.education_system.service.TVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vedio")
public class vedioController {
    @Autowired
    private TVideoService tVideoService;

    @RequestMapping("/watch")
    public ResponseEntity<Map> tvediosee(String id){
        int Id = Integer.parseInt(id);
        TVideo tVideo = tVideoService.TVideoFindbyid(Id);
        String fujian = tVideo.getFujian();
        Map<String, Object> map = new HashMap<>();

        if(tVideo!=null){
            map.put("path",fujian);
            return new ResponseEntity<Map>(map, HttpStatus.OK);
        }
        else{
            map.put("path",null);
            return new ResponseEntity<Map>(map,HttpStatus.OK);
        }


    }
}
