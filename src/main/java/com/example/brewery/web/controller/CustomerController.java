package com.example.brewery.web.controller;

import com.example.brewery.web.model.customerDto;
import com.example.brewery.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody customerDto customerDto){
        customerDto savedCustomer = customerService.addCustomer(customerDto);
        HttpHeaders header = new HttpHeaders();
        header.set("location","/api/v1/customer" + savedCustomer.getId().toString() );
        return new ResponseEntity(header, HttpStatus.CREATED);
    }

    @PutMapping("/{custId}")
    public ResponseEntity updateCustomer(@PathVariable UUID custId, @RequestBody customerDto customerDto){
        customerService.updateCustomer(custId, customerDto);
        return new ResponseEntity( HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/custId")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID custId){
        customerService.deleteCustomer(custId);
    }
}
