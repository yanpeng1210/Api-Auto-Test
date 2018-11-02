package com.demo.piaoshen;

import com.demo.common.GlobalVar;
import com.demo.common.annotation.GET;
import com.demo.common.annotation.Param;
import com.demo.common.annotation.SERVER;
import com.jayway.restassured.response.Response;

/**
 * @auth Yanpeng
 * @Date 2018/11/2 17:07
 */
@SERVER(GlobalVar.CINEMA_API_PIAOSHEN_SERVER)
public interface CinemaApi {
    /**
     * 按商圈、地铁查找影院
     * @param locationId 城市Id,必填
     * @param movieId 影片Id,非必填
     * @param date 日期，格式（yyyyMMdd）,非必填
     * @return Response
     */
    @GET(path = "/cinema/screening.api" , description = "按商圈、地铁查找影院")
    Response cinemaScreening(@Param("locationId") int locationId,
                             @Param("movieId") int movieId,
                             @Param("date") String date);

    /**
     * 即将上映
     * @param cityId 城市Id,必填
     * @return Response
     */
    @GET(path = "/movie/coming.api" , description = "票神-即将上映")
    Response movieComing(@Param("cityId") int cityId);
}
