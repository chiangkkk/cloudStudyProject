package org.chiangkai.borrow.service;

import org.chiangkai.borrow.model.UserBorrowDetail;

/**
 * @author Chiangkai
 * @date 2022/8/14 16:02
 */
public interface BorrowService {
    UserBorrowDetail getBorrowByUid(Integer uid);

}
