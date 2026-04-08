package com.tixy.api.auth.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record AuthTokens(
        String accessToken,
        @JsonIgnore
        String refreshToken
) {}