package com.example.brewery.web.controller;

import com.example.brewery.web.model.customerDto;
import com.example.brewery.web.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{custId}")
    public ResponseEntity<customerDto> getCustomer(@PathVariable("custId")UUID custId){
        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }
}
