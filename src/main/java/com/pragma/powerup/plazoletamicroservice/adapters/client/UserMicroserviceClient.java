package com.pragma.powerup.plazoletamicroservice.adapters.client;

import com.pragma.powerup.plazoletamicroservice.adapters.driving.http.dto.response.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usermicroservice", url = "http://localhost:8091")
public interface UserMicroserviceClient {

    @GetMapping("/exposed/{id}")
    UserResponseDto getUserById(@PathVariable("id") Long id);
}
