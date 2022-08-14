package org.chiangkai.borrow.controller;

import org.chiangkai.borrow.model.UserBorrowDetail;
import org.chiangkai.borrow.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chiangkai
 * @date 2022/8/14 16:40
 */
@RestController
public class BorrowController {
    @Autowired
    private BorrowService borrowService;
    @RequestMapping("/borrow/{uid}")
    public UserBorrowDetail userBorrowDetail(@PathVariable("uid") Integer uid){
        return borrowService.getBorrowByUid(uid);
    }
}
