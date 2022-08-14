package org.chiangkai.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.chiangkai.model.Book;


/**
 * @author Chiangkai
 * @date 2022/8/14 15:08
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
