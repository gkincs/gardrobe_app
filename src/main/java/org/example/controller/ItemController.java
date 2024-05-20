package org.example.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.example.entity.ItemEntity;
import org.example.request.ItemRequest;
import org.example.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * A RESTful API végpontokat kezelő ItemController osztály.
 * Ez az osztály felelős az Item létrehozásáért, lekérdezéséért, frissítéséért és törléséért.
 * A megfelelő HTTP kérések esetén válaszokat ad vissza az ItemService rétegből.
 */
@RestController
public class ItemController {

    @Autowired
    private IItemService itemService;

    @PostMapping("/item")
    public ItemEntity saveItem(@RequestBody @Valid ItemRequest request) {
        return itemService.saveItem(request);
    }

    @GetMapping("/item/{id}")

    public ItemEntity getItem(@PathVariable("id") Long id) {
        return itemService.getItemById(id);
    }

    @PutMapping("/item/{id}")
    public ItemEntity updateItem(@PathVariable("id") Long id, @RequestBody @Valid ItemRequest request) {
        return itemService.updateItem(id, request);
    }

    @DeleteMapping("/item/{id}")
    public void delItem(@PathVariable("id") Long id) {
        itemService.deleteItemById(id);
    }

    @GetMapping("/item/oldest_wash")
    public List<ItemEntity> findFirstByOrderByDateOfWashAsc() {
        return itemService.findFirstByOrderByDateOfWashAsc();
    }
}
