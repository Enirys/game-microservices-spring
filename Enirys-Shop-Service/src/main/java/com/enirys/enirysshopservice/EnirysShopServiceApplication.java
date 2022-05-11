package com.enirys.enirysshopservice;

import com.enirys.enirysshopservice.entities.Item;
import com.enirys.enirysshopservice.enums.ItemType;
import com.enirys.enirysshopservice.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class EnirysShopServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnirysShopServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ItemRepository itemRepository)
    {
        return args -> {
            itemRepository.save(new Item(null, "Classic", 0.0, 12, 26.0, ItemType.Sidearm));
            itemRepository.save(new Item(null, "Shorty", 200.0, 2, 12.0, ItemType.Sidearm));
            itemRepository.save(new Item(null, "Frenzy", 400.0, 15, 26.0, ItemType.Sidearm));
            itemRepository.save(new Item(null, "Ghost", 500.0, 15, 30.0, ItemType.Sidearm));
            itemRepository.save(new Item(null, "Sheriff", 800.0, 30, 55.0, ItemType.Sidearm));

            itemRepository.save(new Item(null, "Stinger", 1000.0, 20, 27.0, ItemType.SMG));
            itemRepository.save(new Item(null, "Spectre", 1600.0, 2, 26.0, ItemType.SMG));

            itemRepository.save(new Item(null, "Bucky", 0.0, 12, 35.0, ItemType.Shotgun));
            itemRepository.save(new Item(null, "Judge", 0.0, 12, 35.0, ItemType.Shotgun));

            itemRepository.save(new Item(null, "Bulldog", 0.0, 12, 35.0, ItemType.Rifle));
            itemRepository.save(new Item(null, "Guardian", 0.0, 12, 35.0, ItemType.Rifle));
            itemRepository.save(new Item(null, "Phantom", 0.0, 12, 35.0, ItemType.Rifle));
            itemRepository.save(new Item(null, "Vandal", 0.0, 12, 35.0, ItemType.Rifle));

            itemRepository.save(new Item(null, "Marshal", 0.0, 12, 35.0, ItemType.Sniper));
            itemRepository.save(new Item(null, "Operator", 0.0, 12, 35.0, ItemType.Sniper));

            itemRepository.save(new Item(null, "Ares", 0.0, 12, 35.0, ItemType.Heavy));
            itemRepository.save(new Item(null, "Odin", 0.0, 12, 35.0, ItemType.Heavy));

            itemRepository.save(new Item(null, "Light Shields", 0.0, 12, 35.0, ItemType.Armor));
            itemRepository.save(new Item(null, "Heavy Shields", 0.0, 12, 35.0, ItemType.Armor));
        };
    }

}
