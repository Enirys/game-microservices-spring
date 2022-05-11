package com.user.userservice.entities;

import com.user.userservice.enums.RankType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Enumerated(EnumType.STRING)
    private RankType rank;
    private String email;
    private String password;
    private int rankPoints;
}
