package com.beout.beout_backend.usermanagment.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beout.beout_backend.usermanagment.application.ports.input.UsermanagmentUseCase;
import com.beout.beout_backend.usermanagment.application.ports.output.UsermanagmentRepository;
import com.beout.beout_backend.usermanagment.application.services.UsermanagmentService;

@Configuration
public class BeanConfiguration {
    @Bean
    public UsermanagmentUseCase createUserUseCase(UsermanagmentRepository usermanagmentRepository) {
        return new UsermanagmentService(usermanagmentRepository);
    }
}
