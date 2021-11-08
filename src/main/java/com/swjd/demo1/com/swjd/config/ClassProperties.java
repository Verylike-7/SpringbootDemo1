package com.swjd.demo1.com.swjd.config;

import com.swjd.demo1.com.swjd.pojo.User;
import lombok.Data;

import java.util.Map;

@Data
public class ClassProperties {
    // 班级名称
    private String className;
    // 教室编号
    private Integer roomNum;
    //注入Map类型数据
    //private Map<String, Object> user;
    //注入对象类型数据
    private User user;
}
