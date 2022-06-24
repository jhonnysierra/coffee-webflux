package com.jhonny.coffeewebflux.controller;

import com.jhonny.coffeewebflux.model.Cafe;
import com.jhonny.coffeewebflux.model.dto.CafeDTO;
import com.jhonny.coffeewebflux.service.ICafeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/cafe")
public class CafeController {

    private final ICafeService iCafeService;


    public CafeController(ICafeService iCafeService) {
        this.iCafeService = iCafeService;
    }

    @PostMapping("/crear")
    public Mono<Cafe> crearCafe(@RequestBody CafeDTO cafeDTO){
        return iCafeService.crearCafe(cafeDTO);
    }

}
