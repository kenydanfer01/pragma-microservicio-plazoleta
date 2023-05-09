package com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.exceptions.OwnerAlreadyAssignedException;
import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.exceptions.RestaurantAlreadyExistsException;
import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.mappers.IRestaurantEntityMapper;
import com.pragma.powerup.plazoletamicroservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;
import com.pragma.powerup.plazoletamicroservice.domain.model.Restaurant;
import com.pragma.powerup.plazoletamicroservice.domain.spi.IRestaurantPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class RestaurantMysqlAdapter implements IRestaurantPersistencePort {
    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        if (restaurantRepository.findByNit(restaurant.getNit()).isPresent()){
            throw new RestaurantAlreadyExistsException();
        }
        if (restaurantRepository.findByIdOwner(restaurant.getIdOwner()).isPresent()){
            throw new OwnerAlreadyAssignedException();
        }
        restaurantRepository.save(restaurantEntityMapper.toRestaurantEntity(restaurant));
    }
}
