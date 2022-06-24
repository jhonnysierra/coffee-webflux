package com.jhonny.coffeewebflux.service;

import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import reactor.core.publisher.Mono;

public interface ICafeService {

    Mono<Cafe> crearCafe(CafeDTO cafeDTO);
}
