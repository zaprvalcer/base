package com.minasan.common.dao;

import com.minasan.common.entities.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao extends JpaRepository<ItemEntity, Integer> {
}
