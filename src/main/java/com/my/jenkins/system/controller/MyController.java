package com.my.jenkins.system.controller;

import com.my.jenkins.system.vo.MyEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping("entity")
    @ResponseBody
    public MyEntity getEntity(){
        return MyEntity.instance();
    }
}
