package com.demo.piaoshen;

import com.demo.common.GlobalVar;
import com.demo.common.runner.BaseRunner;
import com.demo.common.utils.ProxyUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @auth Yanpeng
 * @Date 2018/11/2 18:14
 */

public class TestCinemaApi extends BaseRunner{
    private CinemaApi cinemaApi = ProxyUtils.create(CinemaApi.class);

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public  void testMovieComing(){

        response = cinemaApi.movieComing(290,true);
        for (String key : GlobalVar.HEADERS.keySet()){
            System.out.println("key : " + key + ",value : " + GlobalVar.HEADERS.get(key));
        }
        response.then();
    }
}
