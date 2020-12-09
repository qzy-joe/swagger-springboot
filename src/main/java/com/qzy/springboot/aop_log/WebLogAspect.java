/*
package com.qzy.springboot.aop_log;
*/
/**
 * @描述
 * @创建人 邱志勇
 * @创建时间 2018/9/14 17:13
 * @修改人和其它信息
 *//*


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

*/
/**
 * 实现web层的日志切面
 *
 * @ClassName WebLog
 * @Description TODO
 * @Auther q2813
 * @Date 2018/9/14 17:13
 * @ersion 1.0
 * @Order(-5) order代表执行顺序 参数越小，越先执行
 **//*

@Slf4j
@Aspect
@Component
@Order(-5)
public class WebLogAspect {
    ThreadLocal<Long> startTime = new ThreadLocal<Long>();

    */
/**
     * 定义一个切入点.
     * <p>
     * 解释下：
//     * <p>
     * <p>
     * <p>
     * ~ 第一个 * 代表任意修饰符及任意返回值.
     * <p>
     * ~ 第二个 * 任意包名
     * <p>
     * ~ 第三个 * 代表任意方法.
     * <p>
     * ~ 第四个 * 定义在web包或者子包
     * <p>
     * ~ 第五个 * 任意方法
     * <p>
     * ~ .. 匹配任意数量的参数.
     *//*


    @Pointcut("execution(public * com.qzy.springboot.*.*.*(..))")
    public void webLog() {
    }


    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        log.info("WebLogAspect.doBefore()");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());

        log.info("HTTP_METHOD : " + request.getMethod());

        log.info("IP : " + request.getRemoteAddr());

        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

        //获取所有参数方法一：
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String paraName = (String) enu.nextElement();
            System.out.println(paraName + ": " + request.getParameter(paraName));
        }
    }


    @AfterReturning("webLog()")
    public void doAfterReturning(JoinPoint joinPoint) {
        // 处理完请求，返回内容
        log.info("WebLogAspect.doAfterReturning()");
        log.info("耗时（毫秒） : " + (System.currentTimeMillis() - startTime.get()));
    }
}
*/
