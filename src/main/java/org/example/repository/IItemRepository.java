package org.example.repository;
import org.example.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends CrudRepository<ItemEntity, Long>{
}
