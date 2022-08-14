package org.chiangkai.book.server;


import org.chiangkai.model.Book;

/**
 * @author Chiangkai
 * @date 2022/8/14 15:14
 */
public interface BookServic {
    Book getBook(Integer bid);
}
