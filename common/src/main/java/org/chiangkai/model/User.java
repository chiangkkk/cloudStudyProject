package org.chiangkai.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Chiangkai
 * @date 2022/8/14
 */
@TableName("db_user")
@Data

public class User  {
    private Integer uid;

    private String name;

    private Integer age;

    private String sex;


}