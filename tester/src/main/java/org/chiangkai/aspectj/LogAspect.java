package org.chiangkai.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.chiangkai.annotation.Log;
import org.springframework.stereotype.Component;

/**
 * @author ChiangKai
 * @date 2022/9/20 16:30
 */
@Component
@Aspect
@Slf4j
public class LogAspect {

    @Before(value = "@annotation(alog)")
    public void berfore(Log alog){
        log.info("here is beforeLog");
        log.info(alog.title());
    }
}
