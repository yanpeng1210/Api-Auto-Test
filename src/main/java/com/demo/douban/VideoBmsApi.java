package com.demo.douban;

import com.demo.common.GlobalVar;
import com.demo.common.annotation.GET;
import com.demo.common.annotation.POST;
import com.demo.common.annotation.Param;
import com.demo.common.annotation.SERVER;
import com.jayway.restassured.response.Response;
/**
 * @auth Yanpeng
 * @Date 2018/10/31 15:00
 */
@SERVER(GlobalVar.VIDEO_BMS_SERVER)
public interface VideoBmsApi {
    /**
     *片方登录
     * @param username 用户名
     * @param password 密码
     * @return Response
     */
    @POST(path = "/login",description = "片方登录")
    Response login(@Param("username") String username,
                   @Param("password") String password);

    /**
     * 搜索电影
     * @param title 影片名
     * @param pageNo
     * @param pageSize
     * @return Response
     */
    @GET(path = "/movie-manage/searchMovieByTitle", description = "搜索电影")
    Response searchMovieByTitle(@Param("title") String title,
                                @Param("pageNo") int pageNo,
                                @Param("pageSize") int pageSize);



}
