package com.dubbo.server.provider.service.impl;

import com.dubbo.server.api.domain.Students;
import com.dubbo.server.api.service.StudentService;
import com.dubbo.server.provider.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by nanzhou on 2017/9/22.
 */
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentDao;

    @Override
    public List<Students> getList() {


        return studentDao.findList();
    }

}
