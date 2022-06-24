package com.jhonny.coffeewebflux.model.dto;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;

@Component
@Data
public class CafeDTO {

    private int id;
    private String nombre;
}
