package com.jhonny.coffeewebflux.service.implement;

import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import com.jhonny.coffeewebflux.repository.CafeRepository;
import com.jhonny.coffeewebflux.service.ICafeService;
import com.jhonny.coffeewebflux.service.mapper.CafeMapper;
import org.springframework.stereotype.Service;
import reactor.core.CoreSubscriber;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicReference;

@Service
public class ICafeServiceImpl implements ICafeService {

    private final CafeRepository cafeRepository;
    private final CafeMapper cafeMapper;

    public ICafeServiceImpl(CafeRepository cafeRepository, CafeMapper cafeMapper) {
        this.cafeRepository = cafeRepository;
        this.cafeMapper = cafeMapper;
    }

    @Override
    public Mono<Cafe> crearCafe(CafeDTO cafeDTO) {
        Cafe cafe = cafeMapper.convertirDTOACafe(cafeDTO);
        return cafeRepository.save(cafe);
    }

    @Override
    public Mono<CafeDTO> buscarCafeId(int id) {

        Mono<Cafe> cafeMono = cafeRepository.findById(id);
        return cafeMono.flatMap(result -> {
            final CafeDTO cafeDTO = new CafeDTO();
            cafeDTO.setId(result.getId());
            cafeDTO.setNombre(result.getNombre());
            return Mono.just(cafeDTO);
        });
    }

    @Override
    public Flux<CafeDTO> listarTodos() {
        return cafeRepository.findAll().flatMap(result -> {
            final CafeDTO cafeDTO = new CafeDTO();
            cafeDTO.setId(result.getId());
            cafeDTO.setNombre(result.getNombre());
            return Flux.just(cafeDTO);
        });
    }

}