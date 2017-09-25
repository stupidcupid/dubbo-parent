package com.dubbo.server.provider.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Created by nanzhou on 2017/9/22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-test/*.xml"})
public class BaseJunitTest {


    protected void print(Object result) {
        System.out.println(JSONObject.toJSONString(result,
                SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.WriteMapNullValue));
    }

}
