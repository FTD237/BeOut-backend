package com.beout.beout_backend.usermanagment.infrastructure.adapters.output;

import com.beout.beout_backend.usermanagment.application.ports.output.UsermanagmentRepository;
import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;
import org.springframework.stereotype.Repository;

@Repository
public class UsermanagmentRepositoryImpl implements UsermanagmentRepository {
    @Override
    public Usermanagment save(Usermanagment entity) {
        return entity;
    }

    @Override
    public Usermanagment findById(Long id) {
        return null;
    }
}
