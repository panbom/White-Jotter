package com.gm.wj.service;

import com.gm.wj.model.Book;
import java.util.List;
/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
public interface BookService {

    public List<Book> findAll();

    public int save(Book book);

    public int update(Book book);

    public void deleteById(int id);

    public List<Book> listByCategory(int cid);

    public List<Book> findAllByTitleLikeOrAuthorLike(String keywords);
}
