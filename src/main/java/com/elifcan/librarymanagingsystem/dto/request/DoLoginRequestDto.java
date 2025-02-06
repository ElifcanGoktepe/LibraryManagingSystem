package com.elifcan.librarymanagingsystem.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DoLoginRequestDto(
        @NotNull
        @NotEmpty
        @Size(min = 3, max = 64)
        String userName,

        @NotNull
        @NotEmpty
        @Size(min = 8, max = 64)
        @Pattern(
                message = "Your password must have at least one lower, one upper, one number and one special character",
                regexp ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*!])(?=\\S+$).{8,}$")
        String password,
        String email) {
}
