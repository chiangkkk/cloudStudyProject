package org.chiangkai.borrow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.chiangkai.borrow.client.BookClient;
import org.chiangkai.borrow.client.UserClient;
import org.chiangkai.borrow.mapper.BorrowMapper;
import org.chiangkai.borrow.model.Borrow;
import org.chiangkai.borrow.model.UserBorrowDetail;
import org.chiangkai.borrow.service.BorrowService;
import org.chiangkai.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chiangkai
 * @date 2022/8/14 16:11
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    BorrowMapper borrowMapper;

    @Autowired
    UserClient userClient;

    @Autowired
    BookClient bookClient;

    @Override
    public UserBorrowDetail getBorrowByUid(Integer uid) {
        QueryWrapper<Borrow> borrowQueryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Borrow> lambda = borrowQueryWrapper.lambda().eq(Borrow::getUid, uid);
        List<Borrow> borrows = borrowMapper.selectList(lambda);
        UserBorrowDetail result = new UserBorrowDetail();
        // 获取用户 user-server
        result.setUser(userClient.getUser(uid));
        if (borrows.size() == 0) {
            return result;
        }
        // 获取书籍 book-seervr
        List<Book> books = borrows.stream().map(bow -> bookClient.getBook(bow.getBid())).collect(Collectors.toList());
        result.setBooks(books);
        return result;
    }
}
