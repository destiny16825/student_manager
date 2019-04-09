package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */
@Controller
@RequestMapping("/student")
public class StuManagerController {

    @Reference
    private IClassesService classesService;

    @Reference
    private IStudentService studentService;

    /**
     * 跳转到添加学生的页面
     * @return
     */
    @RequestMapping("/toInsert")
    public String toInsert(ModelMap map){
        List<Classes> classes = classesService.queryAll();
        System.out.println("查询所有班级："+classes);
        map.put("classes",classes);
        return "stuInsert";
    }

    /**
     * 添加学生的方法
     * @param student
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Student student){
        System.out.println("获取到页面的学生信息：" + student);
        studentService.insert(student);
        return "redirect:/";
    }
}
