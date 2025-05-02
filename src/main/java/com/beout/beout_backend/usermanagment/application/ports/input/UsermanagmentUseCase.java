package com.beout.beout_backend.usermanagment.application.ports.input;

import com.beout.beout_backend.usermanagment.domain.model.Usermanagment;


public interface UsermanagmentUseCase {
    Usermanagment createUser(Usermanagment usermanagment);
    Usermanagment getUser(Long id);
}
