package com.enirys.enirysinventoryservice.repositories;

import com.enirys.enirysinventoryservice.entities.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<InventoryItem, Long> {

    @Query("SELECT invitem from inventoryitem invitem where invitem.userId=?1")
    public List<InventoryItem> getInventoryItemByUserId(Long userId);
    @Query("SELECT invitem from inventoryitem invitem where invitem.catalogItemId=?1")
    public InventoryItem getInventoryItemByCatalogItemId(Long catalogItemid);
}
