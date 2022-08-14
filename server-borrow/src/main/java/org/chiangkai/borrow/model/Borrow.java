package org.chiangkai.borrow.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("db_borrow")
public class Borrow {
    private Integer id;

    private Integer uid;

    private Integer bid;
}