package org.chiangkai.borrow.model;

import lombok.Data;
import org.chiangkai.model.Book;
import org.chiangkai.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiangkai
 * @date 2022/8/14 16:05
 */
@Data
public class UserBorrowDetail {
    public UserBorrowDetail() {
        this.user = null;
        this.books = new ArrayList<>();
    }

    User user;
    List<Book> books;
}
