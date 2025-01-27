package com.gm.wj.service;

import com.gm.wj.model.Category;

import java.util.List;

/**
 * @author panbo
 * @version 1.0.0
 * @ClassName BookServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:23:00
 */
public interface CategoryService {

    List<Category> findAll();

    Category findById(Integer id);

    int insert(Category category);

    int update(Category category);

    void deleteById(Integer id);
}
