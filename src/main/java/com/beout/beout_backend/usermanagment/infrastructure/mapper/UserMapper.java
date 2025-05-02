package com.beout.beout_backend.usermanagment.infrastructure.mapper;

import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;
import com.beout.beout_backend.usermanagment.infrastructure.dto.UserDto;

public class UserMapper {

    public static Usermanagment toDomain(UserDto dto) {
        return new Usermanagment(dto.id);
    }

    public static UserDto toDto(Usermanagment user) {
        UserDto dto = new UserDto();
        dto.id = user.getId();
        return dto;
    }

}
