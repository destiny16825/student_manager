package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StudengMapper;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author LongDongWen
 * @Date 2019/4/9
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudengMapper studengMapper;

    @Override
    public int insert(Student student) {
        return studengMapper.insert(student);
    }

    @Override
    public List<Student> queryAll() {
        return studengMapper.selectList(null);
    }
}
