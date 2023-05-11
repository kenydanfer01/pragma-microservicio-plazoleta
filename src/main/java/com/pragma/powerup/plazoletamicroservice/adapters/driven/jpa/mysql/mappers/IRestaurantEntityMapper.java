package com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import com.pragma.powerup.plazoletamicroservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantEntityMapper {

    RestaurantEntity toRestaurantEntity (Restaurant restaurant);
    List<RestaurantEntity> toRestaurantEntityList (List<Restaurant> restaurantList);

    Restaurant toRestaurant (RestaurantEntity restaurantEntity);
    List<Restaurant> toRestaurantList (List<RestaurantEntity> restaurantEntityList);
}
