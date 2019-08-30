package com.gm.wj.service.impl;

import com.gm.wj.dao.BookMapper;
import com.gm.wj.model.Book;
import com.gm.wj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public int save(Book book) {
        return bookMapper.save(book);
    }

    @Override
    public int update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public void deleteById(int id) {
        bookMapper.deleteById(id);
    }

    @Override
    public List<Book> listByCategory(int cid) {
        return bookMapper.listByCategory(cid);
    }

    @Override
    public List<Book> findAllByTitleLikeOrAuthorLike(String keywords) {
        return bookMapper.findAllByTitleLikeOrAuthorLike(keywords);
    }
}
