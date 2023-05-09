package com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurant")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(unique = true, nullable = false, length = 13)
    private String phone;

    @Column(nullable = false)
    private String urlLogo;

    @Column(unique = true, nullable = false, length = 10)
    private String nit;

    @Column(unique = true, name = "id_owner",nullable = false)
    private Long idOwner;
}
