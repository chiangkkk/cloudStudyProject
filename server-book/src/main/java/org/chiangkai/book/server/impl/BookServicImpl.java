package org.chiangkai.book.server.impl;

import org.chiangkai.book.mapper.BookMapper;
import org.chiangkai.model.Book;
import org.chiangkai.book.server.BookServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chiangkai
 * @date 2022/8/14 15:15
 */
@Service
public class BookServicImpl implements BookServic {

    @Autowired
    BookMapper bookMapper;

    @Override
    public Book getBook(Integer uid) {
        return bookMapper.selectById(uid);
    }
}
