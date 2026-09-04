package com.example.booking.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(description = "Login credentials request")
public class LoginRequest {

    @Schema(description = "Username", example = "admin")
    private String username;

    @Schema(description = "Email address (alternative to username)", example = "admin@example.com")
    private String email;

    @NotBlank(message = "Password is required")
    @Schema(description = "Password", example = "admin123")
    private String password;

    public String getUsername() {
        if (username != null && !username.isBlank()) {
            return username;
        }
        return email;
    }
}
