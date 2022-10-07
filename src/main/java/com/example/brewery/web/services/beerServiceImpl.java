package com.example.brewery.web.services;

import com.example.brewery.web.model.beerDto;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class beerServiceImpl implements BeerService{
    @Override
    public beerDto getBeerById(UUID beerId) {
        return beerDto.builder().id(UUID.randomUUID()).beerName("galaxy cat").beerStyle("Pale Ale").build();
    }
}
