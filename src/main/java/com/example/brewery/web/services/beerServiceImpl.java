package com.example.brewery.web.services;

import com.example.brewery.web.model.beerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Slf4j
@Service
public class beerServiceImpl implements BeerService{
    @Override
    public beerDto getBeerById(UUID beerId) {
        return beerDto.builder().id(UUID.randomUUID()).beerName("galaxy cat").beerStyle("Pale Ale").build();
    }

    @Override
    public beerDto saveBeerDto(beerDto savedDto) {
        return beerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, beerDto beerDto) {
        //TODO - ADD LOGIC
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer with uuid" + beerId.toString());
    }
}
