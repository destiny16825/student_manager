package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LongDongWen
 * @Date 2019/4/8
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String welcome(){
        return "home";
    }
}
