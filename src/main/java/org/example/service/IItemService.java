package org.example.service;
import org.example.entity.ItemEntity;
import org.example.request.ItemRequest;

public interface IItemService {
    ItemEntity saveItem(ItemRequest userRequest);

    ItemEntity getItemById(Long id);

    ItemEntity updateItem(Long id, ItemRequest userRequest);

    void deleteItemById(Long id);
}
