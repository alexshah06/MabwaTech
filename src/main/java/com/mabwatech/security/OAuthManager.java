package com.mabwatech.security;

public interface OAuthManager {
    String generateAccessToken(String email);
    String generateRefreshToken();
    boolean isTokenValid(String token);
    void revokeRefreshToken(String email);
}
