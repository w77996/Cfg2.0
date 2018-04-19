package com.qx.cfg.service;

import com.qx.cfg.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> selectAllUser();
}