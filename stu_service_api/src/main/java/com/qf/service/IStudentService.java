package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */
public interface IStudentService {
    //添加学生
    int insert(Student student);

    //查询学生列表
    List<Student> queryAll();
}
