package com.learning.simplecrud.repository;

import com.learning.simplecrud.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
