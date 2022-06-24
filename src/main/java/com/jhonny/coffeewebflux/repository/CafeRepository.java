package com.jhonny.coffeewebflux.repository;

import com.jhonny.coffeewebflux.model.Cafe;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends ReactiveCrudRepository<Cafe, Integer> {
}
