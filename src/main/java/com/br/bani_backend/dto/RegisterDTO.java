package com.br.bani_backend.dto;

import com.br.bani_backend.entity.enums.UserRole;

public record RegisterDTO(String username, String password, UserRole role) {

}
