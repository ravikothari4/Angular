package com.myapp.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.crudapp.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}