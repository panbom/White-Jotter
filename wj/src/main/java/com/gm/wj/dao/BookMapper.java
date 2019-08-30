package com.gm.wj.dao;

import com.gm.wj.model.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;
/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
@Component
public interface BookMapper {
    List<Book> findAll();

    int save(Book book);

    int update(Book book);

    void deleteById(@Param("id") int id);

    List<Book> listByCategory(@Param("cid") int cid);

    List<Book> findAllByTitleLikeOrAuthorLike(@Param("keywords") String keywords);
}
