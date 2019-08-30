package com.gm.wj.service.impl;

import com.gm.wj.dao.CategoryMapper;
import com.gm.wj.model.Category;
import com.gm.wj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panbo
 * @version 1.0.0
 * @ClassName CategoryServiceImpl.java
 * @Description TODO
 * @createTime 2019年08月30日 14:45:00
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.findById(id);
    }

    @Override
    public int insert(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.update(category);
    }

    @Override
    public void deleteById(Integer id) {
        categoryMapper.deleteById(id);
    }
}
