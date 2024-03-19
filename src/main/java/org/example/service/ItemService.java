package org.example.service;

import org.example.entity.ItemEntity;
import org.example.repository.IItemRepository;
import org.example.request.ItemRequest;
import org.example.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class ItemService implements IItemService{
    @Autowired
    private IItemRepository itemRepository;

    @Override
    public ItemEntity saveItem(ItemRequest userRequest) {
        ItemEntity productEntity = ItemEntity.builder()
                .name(userRequest.getName())
                .takeOutDate(userRequest.getTakeOutDate())
                .dateOfWash(userRequest.getDateOfWash())
                .build();
        return itemRepository.save(productEntity);
    }

    @Override
    public ItemEntity getItemById(Long id) {
        return null;
    }

    @Override
    public ItemEntity updateItem(Long id, ItemRequest userRequest) {
        return itemRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteItemById(Long id) {
       itemRepository.deleteById(id);

    }
}
