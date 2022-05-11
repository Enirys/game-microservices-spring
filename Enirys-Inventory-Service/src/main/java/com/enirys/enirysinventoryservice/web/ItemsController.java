package com.enirys.enirysinventoryservice.web;

import com.enirys.enirysinventoryservice.entities.InventoryItem;
import com.enirys.enirysinventoryservice.repositories.ItemsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {

    private ItemsRepository itemsRepository;

    public ItemsController(ItemsRepository itemsRepository)
    {
        this.itemsRepository = itemsRepository;
    }

    @GetMapping(path = "/inventory/{userId}")
    public List<InventoryItem> getInventoryItemsByUser(@PathVariable Long userId)
    {
        return itemsRepository.getInventoryItemByUserId(userId);
    }

    @PostMapping(path = "/inventory")
    public void addItem(@RequestBody InventoryItem inventoryItem)
    {
        itemsRepository.save(inventoryItem);
    }

    @DeleteMapping(path = "/inventory/{id}")
    public void deleteItem(@PathVariable Long id)
    {
        itemsRepository.deleteById(itemsRepository.getInventoryItemByCatalogItemId(id).getId());
    }
}
