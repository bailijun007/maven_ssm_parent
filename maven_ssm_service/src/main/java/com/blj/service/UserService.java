package com.blj.service;
import com.blj.domain.User;

import java.util.List;

/**
 * 业务层
 */
public interface UserService {
    //查找全部用户
    public List<User> finfAll();
    //保存用户信息
    public int savaUser(User user);
}
