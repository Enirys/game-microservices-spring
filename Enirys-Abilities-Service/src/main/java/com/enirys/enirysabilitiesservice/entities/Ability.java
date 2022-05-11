package com.enirys.enirysabilitiesservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.security.util.Length;

import javax.persistence.*;

@Entity(name = "ability")
@Table(name = "abilities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long agentId;
    private String name;
    @Column(length = 1000)
    private String description;
    private double cooldown;
}
