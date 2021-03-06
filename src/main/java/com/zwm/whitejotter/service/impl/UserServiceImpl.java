package com.zwm.whitejotter.service.impl;

import com.zwm.whitejotter.bean.po.User;
import com.zwm.whitejotter.mapper.UserMapper;
import com.zwm.whitejotter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户Service实现类
 * @Author: zhangweiming
 * @Date: 19:34 2021/3/6
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public Boolean exist(String username) {
        return null != findByUsername(username);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username, password);
    }


}
