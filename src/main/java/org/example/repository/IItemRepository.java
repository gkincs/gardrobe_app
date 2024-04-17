package org.example.repository;

import org.example.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/***
 *Ez az interfész definiálja a szükséges adatelérési műveleteket az Item-ekkel kapcsolatosan,
 * például a létrehozás, lekérdezés, frissítés és törlés.
 */
@Repository
public interface IItemRepository extends CrudRepository<ItemEntity, Long> {
}
