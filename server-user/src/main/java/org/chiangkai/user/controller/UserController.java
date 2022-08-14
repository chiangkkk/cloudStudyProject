package org.chiangkai.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.chiangkai.model.User;
import org.chiangkai.user.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiangkai
 * @date 2022/8/14 13:39
 */
@RestController
@Slf4j
public class UserController {


    @Autowired
    UserServer userServer;

    @RequestMapping(value = "/user/{uid}")
    public User getUser(@PathVariable(value = "uid") Integer uid) {
        User user = userServer.getUser(uid);
        log.info("获取用户user={}", user);
        return user;
    }
}
