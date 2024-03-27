package org.example.service;

import lombok.SneakyThrows;
import org.example.entity.ItemEntity;
import org.example.exception.ItemNotFoundException;
import org.example.repository.IItemRepository;
import org.example.request.ItemRequest;
import org.example.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
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
    @SneakyThrows
    public ItemEntity getItemById(Long id) {
        return itemRepository.findById(id).orElseThrow(ItemNotFoundException::new);
    }

    @Override
    @SneakyThrows
    public ItemEntity updateItem(Long id, ItemRequest userRequest) {
        ItemEntity itemEntity = itemRepository.findById(id).orElseThrow(ItemNotFoundException::new);
        itemEntity.setName(userRequest.getName());
        itemEntity.setTakeOutDate(userRequest.getTakeOutDate());
        return itemRepository.save(itemEntity);
    }

    @Override
    public void deleteItemById(Long id) {
       itemRepository.deleteById(id);
    }
}
