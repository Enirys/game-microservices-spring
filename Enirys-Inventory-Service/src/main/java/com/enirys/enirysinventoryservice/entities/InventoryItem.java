package com.enirys.enirysinventoryservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "inventory")
@Entity(name = "inventoryitem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long catalogItemId;
}
