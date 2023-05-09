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

    @Mapping(target = "restaurantEntity.id", source = "restaurant.id")
    RestaurantEntity toRestaurantEntity (Restaurant restaurant);
    List<RestaurantEntity> toRestaurantEntityList (List<Restaurant> restaurantList);

    @Mapping(target = "restaurant.id", source = "restaurantEntity.id")
    Restaurant toRestaurant (RestaurantEntity restaurantEntity);
    List<Restaurant> toRestaurantList (List<RestaurantEntity> restaurantEntityList);
}
