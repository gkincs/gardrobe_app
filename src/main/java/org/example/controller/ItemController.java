package org.example.controller;

import org.example.entity.ItemEntity;
import jakarta.validation.Valid;
import org.example.request.ItemRequest;
import org.example.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    private IItemService IItemService;

    @PostMapping("/item")
    public ItemEntity saveItem(@RequestBody @Valid ItemRequest request) {
        return IItemService.saveItem(request);
    }

    @GetMapping("/item/{id}")
    public ItemEntity getItem(@PathVariable("id") Long id) {
        return IItemService.getItemById(id);
    }

    @PutMapping("/item/{id}")
    public ItemEntity updateItem(@PathVariable("id") Long id,@RequestBody @Valid ItemRequest request){
        return IItemService.updateItem(id,request);
    }

    @DeleteMapping("/item/{id}")
    public void delItem(@PathVariable("id") Long id) {
        IItemService.deleteItemById(id);
    }
}
