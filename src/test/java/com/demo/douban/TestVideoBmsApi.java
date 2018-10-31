package com.demo.douban;

import com.demo.common.GlobalVar;
import com.demo.common.runner.BaseRunner;
import com.demo.common.utils.ProxyUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
/**
 * @auth Yanpeng
 * @Date 2018/10/31 15:03
 */
public class TestVideoBmsApi extends BaseRunner{
    private VideoBmsApi videoBmsApi = ProxyUtils.create(VideoBmsApi.class);

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    @Test
    public void testLogin() throws Exception{
        response = videoBmsApi.login("476059272@qq.com","11111111");
        response.then().body("data.email", equalTo("476059272@qq.com"));
/*        Headers headers = response.getHeaders();
        String cookie = headers.getValue("Set-Cookie");*/
        GlobalVar.COOKIES = response.getCookies();

    }
    @Test
    public void testCurrentUser() throws Exception{
        for (String key : GlobalVar.COOKIES.keySet()){
            System.out.println("key : " + key + ",value : " + GlobalVar.COOKIES.get(key));
        }
        response = videoBmsApi.searchMovieByTitle("速度",1,1);
        response.then().body("data.results[0].id",equalTo(112208));
    }
}
