package org.chiangkai.user.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.chiangkai.user.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserServerImplTest {
    @Autowired
    UserServer userServer;

    @Test
    public void getUserServer() {
        System.out.println(12);
        log.info("user={}",userServer.getUser(2));

    }
}