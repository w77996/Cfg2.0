package com.qx.cfg.service.impl;

import com.qx.cfg.bean.UserInfo;
import com.qx.cfg.dao.UserInfoDao;
import com.qx.cfg.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> selectAllUser() {
        return userInfoDao.selectAllUser();
    }
}
