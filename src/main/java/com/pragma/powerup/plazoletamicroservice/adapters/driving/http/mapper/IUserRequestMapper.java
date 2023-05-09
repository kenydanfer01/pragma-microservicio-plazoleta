package com.pragma.powerup.plazoletamicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.plazoletamicroservice.adapters.driving.http.dto.request.UserRequestDto;
import com.pragma.powerup.plazoletamicroservice.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    @Mapping(target = "role.id", source = "idRole")
    User toUser(UserRequestDto userRequestDto);
}
