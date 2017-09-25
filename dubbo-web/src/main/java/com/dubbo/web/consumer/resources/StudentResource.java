package com.dubbo.web.consumer.resources;

import com.alibaba.fastjson.JSONObject;
import com.dubbo.server.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by nanzhou on 2017/9/25.
 */
@Component
@Path(value = "/student")
public class StudentResource {


    @Autowired
    private StudentService studentService;


    @GET
    @Path("/list")
    @Produces("text/json;charset=utf-8")
    public String getList() {
        return JSONObject.toJSONString(studentService.getList());
    }
}
