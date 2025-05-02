package com.beout.beout_backend.usermanagment.application.services;

import com.beout.beout_backend.usermanagment.application.ports.input.UsermanagmentUseCase;
import com.beout.beout_backend.usermanagment.application.ports.output.UsermanagmentRepository;
import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;

public class UsermanagmentService implements UsermanagmentUseCase {
    private final UsermanagmentRepository usermanagmentRepository;

    public UsermanagmentService(UsermanagmentRepository usermanagmentRepository) {
        this.usermanagmentRepository = usermanagmentRepository;
    }

    @Override
    public Usermanagment createUser(Usermanagment usermanagment) {
        return usermanagmentRepository.save(usermanagment);
    }

    @Override
    public Usermanagment getUser(Long id) {
        return usermanagmentRepository.findById(id);
    }

    
}
