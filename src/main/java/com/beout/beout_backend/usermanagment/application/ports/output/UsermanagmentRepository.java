package com.beout.beout_backend.usermanagment.application.ports.output;

import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;

public interface UsermanagmentRepository {
    Usermanagment save(Usermanagment usermanagment);
    Usermanagment findById(Long id);
}
