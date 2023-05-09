package com.pragma.powerup.plazoletamicroservice.domain.spi;

import com.pragma.powerup.plazoletamicroservice.domain.model.Restaurant;

public interface IRestaurantPersistencePort {
    void saveRestaurant (Restaurant restaurant);
}
