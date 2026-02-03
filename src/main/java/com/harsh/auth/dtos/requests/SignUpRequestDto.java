package com.harsh.auth.dtos.requests;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SignUpRequestDto {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;

    private String phoneNumber;
    private String email;
}
