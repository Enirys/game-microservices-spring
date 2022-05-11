package com.enirys.enirysshopservice.repositories;

import com.enirys.enirysshopservice.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
