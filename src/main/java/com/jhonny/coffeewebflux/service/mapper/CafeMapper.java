package com.jhonny.coffeewebflux.service.mapper;


import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import org.mapstruct.Mapper;
import reactor.core.publisher.Mono;

@Mapper(componentModel = "spring")
public interface CafeMapper {

    public Cafe convertirDTOACafe(CafeDTO cafeDTO);

    public CafeDTO convertirCafeADTO(Cafe cafe);

}
