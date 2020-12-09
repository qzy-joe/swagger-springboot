package com.qzy.springboot.controller;/**
 * @描述
 * @创建人 邱志勇
 * @创建时间 2018/9/14 15:04
 * @修改人和其它信息
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 1.test 全局捕获异常
 * 2.test lombok 插件生成日志
 *
 * @ClassName errorController
 * @Description TODO
 * @Auther q2813
 * @Date 2018/9/14 15:04
 * @ersion 1.0
 **/
@Slf4j
@RestController
public class errorController {
    @RequestMapping("/getResult")
    public String getMath(int i) {
        log.info("*****************i[]" + i);
        int j = 1 / i;
        return "result==" + j;
    }

}
