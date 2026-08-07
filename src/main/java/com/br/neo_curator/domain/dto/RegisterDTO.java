package com.br.neo_curator.domain.dto;

import com.br.neo_curator.domain.entity.enums.UserRole;

public record RegisterDTO(String username, String password, UserRole role) {

}
