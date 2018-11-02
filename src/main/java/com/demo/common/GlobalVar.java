package com.demo.common;

import com.demo.common.utils.ListenerUtils;

import java.util.HashMap;
import java.util.Map;

public class GlobalVar {

    public static final String DOUBAN_MOVIE_SERVER = "DOUBAN_MOVIE_SERVER";
    public static String DOUBAN_MOVIE_SERVER_URL = "http://api.douban.com/v2/movie";
    public static final String VIDEO_BMS_SERVER = "VIDEO_BMS_SERVER";
    public static String VIDEO_BMS_SERVER_URL = "http://video-bms-api.mtime.com";
    /**
     * 票神
     */
    public static String USER_API_PIAOSHEN_SERVER = "USER_API_PIAOSHEN_SERVER";
    public static String USER_API_PIAOSHEN_URL = "http://user-api.piaoshen-dev.com";
    public static String MISC_API_PIAOSHEN_SERVER = "MISC_API_PIAOSHEN_SERVER";
    public static String MISC_API_PIAOSHEN_URL = "http://misc-api.piaoshen-dev.com";
    public static String CINEMA_API_PIAOSHEN_SERVER = "CINEMA_API_PIAOSHEN_SERVER";
    public static String CINEMA_API_PIAOSHEN_URL = "http://cinema-api.piaoshen-dev.com";
    public static String TICKET_API_PIAOSHEN_SERVER = "TICKET_API_PIAOSHEN_SERVER";
    public static String TICKET_API_PIAOSHEN_URL = "http://ticket-api.piaoshen-dev.com";
    public static Map<String, String> COOKIES = new HashMap<>();
    public static Map<String, Object> HEADERS = new HashMap<>();

    // 失败重试，等于2，则失败重试1次，共执行2次
    public final static Integer RETRY_COUNTS = 2;

    public static String REPORT_PATH = "target/reports/";

    public final static ListenerUtils listenerUtils = new ListenerUtils();
}
