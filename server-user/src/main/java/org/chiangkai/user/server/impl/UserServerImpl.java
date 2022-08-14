package org.chiangkai.user.server.impl;

import org.chiangkai.user.mapper.UserMapper;
import org.chiangkai.user.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.chiangkai.model.User;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }
}
