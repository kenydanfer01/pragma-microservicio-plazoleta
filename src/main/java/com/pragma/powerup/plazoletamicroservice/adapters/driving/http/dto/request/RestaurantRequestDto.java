package com.pragma.powerup.plazoletamicroservice.adapters.driving.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RestaurantRequestDto {

    @NotBlank
    @Pattern(regexp = "^(?=.*[a-zA-Z])[a-zA-Z0-9]+$", message = "The field must contain letters and optionally numbers")
    private String name;

    @NotBlank
    @Pattern(regexp = "^[0-9]+$", message = "The field must contain only numeric characters")
    private String nit;

    @NotBlank
    private String address;

    @NotBlank
    @Pattern(regexp = "^\\+?\\d{1,12}$", message = "Phone number must be a sequence of up to 13 digits, optionally starting with a '+' sign")
    private String phone;

    @NotBlank
    private String urlLogo;

    @NotNull
    @Positive
    private Long idOwner;
}
