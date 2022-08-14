package org.chiangkai.book.controller;

import org.chiangkai.book.server.BookServic;
import org.chiangkai.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 * @author Chiangkai
 * @date 2022/8/14 15:28
 */
@RestController
public class BookController {

    @Autowired
    BookServic bookServic;

    @RequestMapping("/book/{bid}")
    public Book getBook(@PathVariable("bid") Integer bid) {
        return bookServic.getBook(bid);
    }
}
