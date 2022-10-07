package com.example.brewery.web.services;

import com.example.brewery.web.model.beerDto;

import java.util.UUID;

public interface BeerService {
    beerDto getBeerById(UUID beerId);

    beerDto saveBeerDto(beerDto beerDto);

    void updateBeer(UUID beerId, beerDto beerDto);

    void deleteBeerById(UUID beerId);
}
