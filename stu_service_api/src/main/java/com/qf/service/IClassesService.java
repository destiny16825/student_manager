package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */
public interface IClassesService {
    /**
     * 根据班级id，添加班级的总人数
     * @param id
     * @return
     */
    int addClasses(int id);

    //查询班级列表
    List<Classes> queryAll();
}
