package com.example.brewery.web.services;

import com.example.brewery.web.model.customerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService{
     customerDto getCustomerById(UUID id);

     customerDto addCustomer(customerDto customerDto);

     void updateCustomer(UUID custId, customerDto customerDto);

     void deleteCustomer(UUID custId);
}
