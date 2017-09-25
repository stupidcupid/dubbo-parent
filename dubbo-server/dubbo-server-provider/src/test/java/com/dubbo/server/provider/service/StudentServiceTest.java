package com.dubbo.server.provider.service;

import com.dubbo.server.api.domain.Students;
import com.dubbo.server.api.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nanzhou on 2017/9/22.
 */
public class StudentServiceTest extends BaseJunitTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void getList() {
        List<Students> list = studentService.getList();
        this.print(list);
    }

}
