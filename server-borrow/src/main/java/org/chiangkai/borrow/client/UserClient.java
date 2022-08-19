package org.chiangkai.borrow.client;

import org.chiangkai.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ChiangKai
 * @date 2022/8/19 17:01
 */
@FeignClient("serverUser")
public interface UserClient {

    @RequestMapping(value = "/user/{uid}")
    User getUser(@PathVariable(value = "uid") Integer uid);
}
