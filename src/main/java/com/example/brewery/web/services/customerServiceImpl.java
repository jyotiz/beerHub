package com.example.brewery.web.services;

import com.example.brewery.web.model.customerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class customerServiceImpl implements CustomerService{

    @Override
    public customerDto getCustomerById(UUID id) {
        return customerDto.builder().id(id).customerName("Gary").build();
    }
}
