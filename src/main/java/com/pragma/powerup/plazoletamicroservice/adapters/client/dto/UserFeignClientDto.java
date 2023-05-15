package com.pragma.powerup.plazoletamicroservice.adapters.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserFeignClientDto {
    private String name;
    private String surname;
    private String dni;
    private String phone;
    private LocalDate birthday;
    private String mail;
    private String password;
    private Long idRole;
}