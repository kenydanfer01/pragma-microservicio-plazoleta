package com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    Optional<RestaurantEntity> findById (Long id);

    Optional<RestaurantEntity> findByNit (String nit);

    Optional<RestaurantEntity> findByIdOwner (Long idOwner);

    void deleteById (Long id);

    Page<RestaurantEntity> findAll (Pageable pageable);
}
