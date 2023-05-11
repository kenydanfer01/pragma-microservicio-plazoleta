package com.pragma.powerup.plazoletamicroservice.adapters.client;

import com.pragma.powerup.plazoletamicroservice.adapters.driving.http.dto.response.UserResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final UserMicroserviceClient userMicroserviceClient;

    @Operation(summary = "Get a employee user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Employee user returned",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponseDto.class))),
                    @ApiResponse(responseCode = "404", description = "User not found with employee role",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))})
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getOwnerClient(@PathVariable Long id) {
        return ResponseEntity.ok(userMicroserviceClient.getUserById(id));
    }
}
