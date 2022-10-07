package com.example.brewery.web.services;

import com.example.brewery.web.model.beerDto;

import java.util.UUID;

public interface BeerService {
    beerDto getBeerById(UUID beerId);
}
