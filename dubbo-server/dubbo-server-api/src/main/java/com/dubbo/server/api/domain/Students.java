package com.dubbo.server.api.domain;

import java.io.Serializable;

/**
 * Created by nanzhou on 2017/9/22.
 */
public class Students implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String sex;

    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
