package com.security.spring_security_oauth2.payload;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public AuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
