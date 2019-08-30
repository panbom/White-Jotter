package com.gm.wj.dao;

import com.gm.wj.model.Category;
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
public interface CategoryMapper {
    List<Category> findAll();

    Category findById(@Param("id")Integer id);

    int insert(Category category);

    int update(Category category);

    void deleteById(@Param("id")Integer id);
}
