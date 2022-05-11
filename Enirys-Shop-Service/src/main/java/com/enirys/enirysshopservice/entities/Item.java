package com.enirys.enirysshopservice.entities;

import com.enirys.enirysshopservice.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int capacity;
    private double damage;
    @Enumerated(EnumType.STRING)
    private ItemType type;
}
