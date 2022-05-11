package com.enirys.enirysshopservice.web;

import com.enirys.enirysshopservice.entities.Item;
import com.enirys.enirysshopservice.repositories.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {
    private ItemRepository itemRepository;

    public ItemsController(ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }

    @GetMapping(path = "/items")
    public List<Item> getItems()
    {
        return itemRepository.findAll();
    }

    @GetMapping(path = "/items/{id}")
    public Item getItemById(@PathVariable Long id)
    {
        return itemRepository.findById(id).get();
    }

    @PostMapping(path = "/items")
    public void createItem(@RequestBody Item item)
    {
        itemRepository.save(item);
    }

    @PutMapping (path = "/items/{id}")
    public Item updateItemById(@PathVariable Long id, @RequestBody Item item)
    {
        item.setId(id);
        return itemRepository.save(item);
    }

    @DeleteMapping(path = "/items/{id}")
    public void deleteItemById(@PathVariable Long id)
    {
        itemRepository.deleteById(id);
    }
}
