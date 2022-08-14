package org.chiangkai.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Chiangkai
 * @date 2022/8/14 15:35
 */
@Data

@TableName("db_book")
public class Book {
    @TableId
    private Integer bid;

    private String title;
    @TableField("`desc`")
    private String desc;
}