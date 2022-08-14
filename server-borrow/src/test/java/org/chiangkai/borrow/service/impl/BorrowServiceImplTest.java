package org.chiangkai.borrow.service.impl;

import org.chiangkai.borrow.service.BorrowService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BorrowServiceImplTest {

    @Autowired
    BorrowService borrowService;

    @Test
    public void borrow(){
        borrowService.getBorrowByUid(1);
    }
}