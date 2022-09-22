package org.chiangkai.borrow.client;

import org.chiangkai.borrow.client.impl.BookClientImpl;
import org.chiangkai.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ChiangKai
 * @date 2022/8/19 16:58
 */
@FeignClient(value = "serverBook",fallback = BookClientImpl.class)
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book getBook(@PathVariable("bid") Integer bid);
}
