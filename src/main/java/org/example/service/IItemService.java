package org.example.service;

import org.example.entity.ItemEntity;
import org.example.request.ItemRequest;

/**
 * Ez az interfész definiálja azokat a módszereket, amelyeket az Item-ekkel kapcsolatos műveletek végrehajtására
 * egy szolgáltatási réteg implementál. Ezek a módszerek az Item létrehozását, lekérdezését, frissítését
 * és törlését biztosítják.
 */
public interface IItemService {
    ItemEntity saveItem(ItemRequest userRequest);

    ItemEntity getItemById(Long id);

    ItemEntity updateItem(Long id, ItemRequest userRequest);

    void deleteItemById(Long id);
}
