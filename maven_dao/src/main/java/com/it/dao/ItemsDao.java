package com.it.dao;

import com.it.domain.Items;

/*
查询
 */
public interface ItemsDao {
    public Items findById(Integer id);
}
