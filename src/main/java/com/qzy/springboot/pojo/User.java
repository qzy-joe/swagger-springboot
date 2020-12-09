package com.qzy.springboot.pojo;/**
 * @描述
 * @创建人 邱志勇
 * @创建时间 2018/9/14 18:06
 * @修改人和其它信息
 */

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName User
 * @Description TODO
 * @Auther q2813
 * @Date 2018/9/14 18:06
 * @ersion 1.0
 **/
@Data
@Slf4j
public class User {
    private String name;
    private Integer age;

    /**
     * @param args
     */
    public static void main(String[] args) {
        User u = new User();
        u.setAge(12);
        u.setName("qzy");
        log.info("name:" + u.getName() + "\n " + "age:" + u.getAge());
        System.out.println("name:" + u.getName() + "\n " + "age:" + u.getAge());
    }
}
