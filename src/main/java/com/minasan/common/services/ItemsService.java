package com.minasan.common.services;

import com.minasan.common.dao.ItemsDao;
import com.minasan.common.dto.Item;
import com.minasan.common.entities.ItemEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsService {
    @Resource
    ItemsDao itemsDao;

    public List<Item> fetchItems() {
        List<ItemEntity> users = itemsDao.findAll();
        return convertItems(users);
    }

    private List<Item> convertItems(List<ItemEntity> entities) {
        List<Item> items = new ArrayList<Item>();
        for(ItemEntity entity : entities) {
            items.add(new Item(entity.getText()));
        }
        return items;
    }
}
