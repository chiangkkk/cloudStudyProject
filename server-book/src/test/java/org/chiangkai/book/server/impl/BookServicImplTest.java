package org.chiangkai.book.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.chiangkai.model.Book;
import org.chiangkai.book.server.BookServic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BookServicImplTest {

    @Autowired
    BookServic bookServic;

    @Test
    void getBook() {
        Book book = bookServic.getBook(1);
        log.info("book={}", book);
    }
}