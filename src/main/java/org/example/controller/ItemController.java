package org.example.controller;

import org.example.entity.ItemEntity;
import org.example.request.ItemRequest;
import org.example.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ItemController {

    @Autowired
    private IItemService IItemService;

    @PostMapping("/item")
    public ItemEntity saveItem(@RequestBody ItemRequest request) {
        return IItemService.saveItem(request);
    }

    @GetMapping("/item/{id}")
    public ItemEntity getItem(@PathVariable("id") Long id) {
        return IItemService.getItemById(id);
    }
}
