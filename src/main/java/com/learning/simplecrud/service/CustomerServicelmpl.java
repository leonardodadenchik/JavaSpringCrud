package com.learning.simplecrud.service;


import com.learning.simplecrud.model.Customer;

import com.learning.simplecrud.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service

public class CustomerServicelmpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
