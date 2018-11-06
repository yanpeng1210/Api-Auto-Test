package com.demo.common.utils;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;


/**
 * @auth Yanpeng
 * @Date 2018/11/2 18:22
 */
@SuppressWarnings("all")
public class PiaoShenMD5 {
    public static Map<String, Object> setPisoShenHeader(String url) {
        Map<String, Object> map = new HashMap<>();
        String channelCode = "android";
        String key = "388C4D156924C9C20E335A888CBBEBCBFB08C08A1A499415FD46D18DD706E866"; //后台约定的key
        String appVersion = "0.0.1";
        //Long time = System.currentTimeMillis();
        String time = System.currentTimeMillis()+"";
        String DownloadChannel = "360_1";
        String udid = "92bc984323b57264WS4DKVY9BAMNVOGE";
        String device = "Redmi Note 4_mt6797";
        String check = null;
        try {
            check = getMD5(channelCode + key + time + new StringBuffer().append(url).insert(4,"s"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("X-PS-ChannelCode",channelCode);
        map.put("X-PS-TS",time);
        map.put("X-PS-Version",appVersion);
        map.put("X-PS-Check",check);
        map.put("X-PS-DownloadChannel",DownloadChannel);
        map.put("X-PS-UDID",udid);
        map.put("X-PS-Device",device);
        return map;
    }

    public static void main(String[] args) throws Exception {
        String channelCode = "android";
        String key = "388C4D156924C9C20E335A888CBBEBCBFB08C08A1A499415FD46D18DD706E866";
        String time = "1541407978830";
        String url = "http://cinema-api.piaoshen-dev.com/movie/coming.api?json=true&cityId=290";
        StringBuffer buf = new StringBuffer();

        buf.append(url);
        buf.insert(4,"s");
        System.out.println(new StringBuffer().append(url).insert(4,"s"));
        String str = channelCode+key+time+url;

        System.out.println(getMD5(str));
    }

    public static String getMD5(String str) throws Exception {
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(str.getBytes("UTF8"));
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        }
        return result;
    }
}