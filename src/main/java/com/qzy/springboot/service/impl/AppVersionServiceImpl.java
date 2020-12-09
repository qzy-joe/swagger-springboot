package com.qzy.springboot.service.impl;

import com.qzy.springboot.entity.AppVersion;
import com.qzy.springboot.entity.AppVersionExample;
import com.qzy.springboot.mapper.AppVersionMapper;
import com.qzy.springboot.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @描述
 * @创建人 joy_qiu
 * @创建时间 2020-09-21-17:11
 * @修改人和其它信息
 */
@Service
public class AppVersionServiceImpl implements AppVersionService {

    @Autowired
    AppVersionMapper appVersionMapper;
    @Override
    public Object getAll() {
        AppVersionExample appVersionExample = new AppVersionExample();
        appVersionExample.createCriteria().andIsDeletedEqualTo((byte)1);
        return appVersionMapper.selectByExample(appVersionExample);
    }

    @Override
    public Object addVersionCode(String versionCode) {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersionCode(versionCode);
        appVersion.setCreateTime(new Date());
        appVersion.setIsDeleted((byte)1);
        int flag = appVersionMapper.insertSelective(appVersion);
        return flag;
    }
}
