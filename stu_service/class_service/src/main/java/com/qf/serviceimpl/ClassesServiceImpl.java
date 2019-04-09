package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */
@Service
public class ClassesServiceImpl implements IClassesService{

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public int addClasses(int id) {
        return 0;
    }

    /**
     * 查询所有班级的方法
     * @return
     */
    @Override
    public List<Classes> queryAll() {
        return classesMapper.selectList(null);
    }
}
