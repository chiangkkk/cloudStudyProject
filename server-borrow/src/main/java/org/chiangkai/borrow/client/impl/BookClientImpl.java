package org.chiangkai.borrow.client.impl;

import org.chiangkai.borrow.client.BookClient;
import org.chiangkai.model.Book;
import org.springframework.stereotype.Component;

/**
 * @author ChiangKai
 * @date 2022/9/22 10:08
 */
@Component
public class BookClientImpl implements BookClient {
    @Override
    public Book getBook(Integer bid) {
        Book book = new Book();
        book.setBid(0);
        book.setTitle("错误书籍");
        book.setDesc("error");
        return book;
    }
}
