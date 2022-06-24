package com.jhonny.coffeewebflux.service.implement;

import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import com.jhonny.coffeewebflux.repository.CafeRepository;
import com.jhonny.coffeewebflux.service.ICafeService;
import com.jhonny.coffeewebflux.service.mapper.CafeMapper;
import reactor.core.publisher.Mono;

public class ICafeServiceImpl implements ICafeService {

    private final CafeRepository cafeRepository;
    private final CafeMapper cafeMapper;

    public ICafeServiceImpl(CafeRepository cafeRepository, CafeMapper cafeMapper) {
        this.cafeRepository = cafeRepository;
        this.cafeMapper = cafeMapper;
    }

    @Override
    public Mono<Cafe> crearCafe(CafeDTO cafeDTO) {
        return cafeRepository.save(cafeMapper.convertirDTOACafe(cafeDTO));
    }

}
