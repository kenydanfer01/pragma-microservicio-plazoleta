package com.pragma.powerup.plazoletamicroservice.domain.api;

import com.pragma.powerup.plazoletamicroservice.domain.model.Role;

import java.util.List;

public interface IRoleServicePort {
    List<Role> getAllRoles();
}
