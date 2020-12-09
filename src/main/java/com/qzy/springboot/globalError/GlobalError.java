/*
package com.qzy.springboot.globalError;
*/
/**
 * @描述
 * @创建人 邱志勇
 * @创建时间 ${date}
 * @修改人和其它信息
 *//*


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

*/
/**
 * 全局捕获异常
 *
 * @ClassName GlobalError
 * @Description TODO
 * @Auther q2813
 * @Date 2018/9/14 15:12
 * @ersion 1.0
 **//*

@ControllerAdvice
public class GlobalError {

    */
/**
     * 返回json格式的错误信息
     *//*

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> eroorResult() {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("errorCode", "500");
        resultMap.put("errorMessage", "系统错误");
        return resultMap;
    }

    */
/*  *//*
*/
/**
     *返回model格式的错误信息
     * @param response
     * @param request
     * @return
     *//*
*/
/*
    @ExceptionHandler(RuntimeException.class)
   public ModelAndView errorModel(HttpServletResponse response, HttpServletRequest request){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("first");
       return modelAndView ;
   }*//*

}
*/
