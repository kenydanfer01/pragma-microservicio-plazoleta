package com.pragma.powerup.plazoletamicroservice.domain.spi;

import com.pragma.powerup.plazoletamicroservice.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    void saveUser(User user);
    void deleteUser(User user);
    List<User> getAllOwners(int page);
    List<User> getAllEmployees(int page);
    List<User> getAllClients(int page);
    User getOwner(Long id);
    User getEmployee(Long id);
    User getClient(Long id);
    User getUser(Long id);
}
