package com.br.neo_curator.dto;

import com.br.neo_curator.entity.enums.UserRole;

public record RegisterDTO(String username, String password, UserRole role) {

}
