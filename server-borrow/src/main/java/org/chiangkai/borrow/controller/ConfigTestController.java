package org.chiangkai.borrow.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/9/22 11:33
 */
@RestController
public class ConfigTestController {

    @Value("${A.B}")
    private String A_B;

    @RequestMapping("/A/B")
    private String getA_B(){
        return A_B;
    }
}
