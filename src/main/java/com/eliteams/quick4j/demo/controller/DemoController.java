package com.eliteams.quick4j.demo.controller;

import com.eliteams.quick4j.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by ghu on 1/23/2017.
 */
@Controller
public class DemoController {

    @Resource
    private DemoService demoService;

    public void getDemo(){
    }

}
