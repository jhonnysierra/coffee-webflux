package com.jhonny.coffeewebflux.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;

@Data
@Table(name = "cafe")
public class Cafe {
    @Id
    @Column("id")
    private int id;

    @Column("nombre")
    private String nombre;
}
