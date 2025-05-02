package com.beout.beout_backend.usermanagment.infrastructure.adapters.input;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beout.beout_backend.usermanagment.application.ports.input.UsermanagmentUseCase;
import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;
import com.beout.beout_backend.usermanagment.infrastructure.dto.UserDto;
import com.beout.beout_backend.usermanagment.infrastructure.mapper.UserMapper;

@RestController
@RequestMapping("/api/usermanagment")
public class UsermanagmentController {

    private final UsermanagmentUseCase usermanagmentUseCase;

    public UsermanagmentController(UsermanagmentUseCase usermanagmentUseCase) {
        this.usermanagmentUseCase = usermanagmentUseCase;
    }

    @PostMapping
    public Usermanagment createUser(@RequestBody UserDto dto) {
        Usermanagment usermanagment = UserMapper.toDomain(dto);
        return usermanagmentUseCase.createUser(usermanagment);
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return UserMapper.toDto(usermanagmentUseCase.getUser(id));
    }
}
