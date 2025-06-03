package com.learning.simplecrud.controller;


import com.learning.simplecrud.model.Customer;

import com.learning.simplecrud.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.query.Param;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping("/customer/")
public class CustomerController {

    @Autowired

    CustomerService customerService;


    @GetMapping("all")

    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    @GetMapping

    public Customer getCustomerById(@Param("customerId") String customerId){
        return customerService.getCustomer(Long.parseLong(customerId));
    }

    @PostMapping

    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @PutMapping

    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping

    public void deleteCustomer(String customerId){
        customerService.deleteCustomer(Long.parseLong(customerId));
    }
}
