package com.lzy.education_system.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

//获取当前时间并转为String
public class DatenowUtils {
    private String nowtime=null;
   public String getDatenow(){
       Date date = new Date();
       SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       nowtime = sf.format(date);
       return nowtime;
   }

}
