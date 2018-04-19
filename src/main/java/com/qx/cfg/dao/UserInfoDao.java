package com.qx.cfg.dao;


import com.qx.cfg.bean.UserInfo;

import java.util.List;

public interface UserInfoDao{

    List<UserInfo> selectAllUser();
}
