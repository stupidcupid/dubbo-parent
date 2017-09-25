package com.dubbo.server.provider.dao;

import com.dubbo.server.api.domain.Students;

import java.util.List;

/**
 * Created by nanzhou on 2017/9/22.
 */
public interface StudentMapper {

     List<Students> findList();
}
