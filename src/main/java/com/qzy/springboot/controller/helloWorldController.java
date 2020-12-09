package com.qzy.springboot.controller;


import com.alibaba.fastjson.JSON;
import com.qzy.springboot.service.AppVersionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @author q2813
 * @ClassName helloworld
 * @Description TODO
 * @Auther q2813
 * @Date 2018/9/14 14:13
 * @ersion 1.0
 **/
@Slf4j
@Api(tags = "测试swagger模块")
@RestController
public class helloWorldController {

    @Autowired
    AppVersionService appVersionService;

    @Value("${name}")
    private String name;

    @ApiOperation("首页")
    @PostMapping(value = "/index")
    @ResponseBody
    public String helloworld(String str) {
        //return "hello!";
        return JSON.toJSONString(appVersionService.getAll());
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(String versionCode) {
        //return "hello!";
        return JSON.toJSONString(appVersionService.addVersionCode(versionCode));
    }

    @RequestMapping(value = "/{firstName}/{lastName}")
    public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return String.format("{\"message\":\"hello %s %s\"}", firstName, lastName);
    }
}
