package com.jhonny.coffeewebflux.service;

import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICafeService {

    Mono<Cafe> crearCafe(CafeDTO cafeDTO);

    Mono<CafeDTO> buscarCafeId(int id);

    Flux<CafeDTO> listarTodos();

}
