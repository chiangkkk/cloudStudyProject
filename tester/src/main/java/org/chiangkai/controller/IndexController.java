package org.chiangkai.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.chiangkai.annotation.Log;
import org.chiangkai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/9/20 15:21
 */
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class IndexController {

    final TestService testService;

    @RequestMapping("/")
    @Log(title = "首页")
    public String index() {
        testService.test();
        log.info("2222");
        return "hello world";
    }
}
