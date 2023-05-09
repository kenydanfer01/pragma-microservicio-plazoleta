package com.pragma.powerup.plazoletamicroservice.domain.api;

import com.pragma.powerup.plazoletamicroservice.domain.model.Restaurant;

public interface IRestaurantServicePort {
    void saveRestaurant (Restaurant restaurant);
}
