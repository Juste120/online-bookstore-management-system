package com.juste.bookstore.dtos;

public record LoginRequestDto(
        String username,
        String password
) {}
