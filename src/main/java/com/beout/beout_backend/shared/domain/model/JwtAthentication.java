package com.beout.beout_backend.shared.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAthentication {
    private String token;
    private Long userId;
    private Long cartId;
}
