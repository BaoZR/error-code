package com.bob.common;/**
 * @Author:bob
 * @DATE:2024/4/20 23:30
 * @Description:
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: bob
 * @date: 2024/4/20 23:30
 * @description: TODO
 */
public class utils {
    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        String s = sdf.format(date);
        return s;
    }
}
