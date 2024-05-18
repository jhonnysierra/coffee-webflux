package com.jhonny.coffeewebflux.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "cafe")
public class Cafe {
    @Id
    @Column("id")
    private int id;

    @Column("nombre")
    private String nombre;
}
