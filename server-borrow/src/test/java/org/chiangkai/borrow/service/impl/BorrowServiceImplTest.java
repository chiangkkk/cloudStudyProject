package org.chiangkai.borrow.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.chiangkai.borrow.service.BorrowService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class BorrowServiceImplTest {

    @Autowired
    BorrowService borrowService;

    @Test
    public void borrow() {
        log.info("userBorrowDetail={}", borrowService.getBorrowByUid(1));
    }
}