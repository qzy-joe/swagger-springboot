package com.qzy.springboot.service;

/**
 * @描述
 * @创建人 joy_qiu
 * @创建时间 2020-09-21-17:11
 * @修改人和其它信息
 */
public interface AppVersionService {
    public Object getAll();

    Object addVersionCode(String versionCode);
}
