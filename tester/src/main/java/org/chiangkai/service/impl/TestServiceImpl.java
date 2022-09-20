package org.chiangkai.service.impl;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.chiangkai.service.TestService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * @author ChiangKai
 * @date 2022/9/20 15:24
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @SneakyThrows
    @Async
    @Override
    public Future<String> test() {
        Thread.sleep(5000);
        log.info("1111");
        return AsyncResult.forValue("121");

    }
}
