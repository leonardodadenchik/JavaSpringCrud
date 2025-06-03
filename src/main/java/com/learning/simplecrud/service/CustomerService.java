package com.learning.simplecrud.service;


import com.learning.simplecrud.model.Customer;

import java.util.List;


public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomer(Long customerId);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long customerId);

}
