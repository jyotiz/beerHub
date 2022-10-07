package com.example.brewery.web.services;

import com.example.brewery.web.model.customerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class customerServiceImpl implements CustomerService{

    @Override
    public customerDto getCustomerById(UUID id) {
        return customerDto.builder().id(id).customerName("Gary").build();
    }

    @Override
    public customerDto addCustomer(customerDto newCustomer) {
        return customerDto.builder().id(newCustomer.getId()).customerName(newCustomer.getCustomerName()).build();
    }

    @Override
    public void updateCustomer(UUID custId, customerDto customerDto) {
        //TODO
    }

    @Override
    public void deleteCustomer(UUID custId) {
        log.debug("Deleteing cutomer .." + custId);
    }
}
