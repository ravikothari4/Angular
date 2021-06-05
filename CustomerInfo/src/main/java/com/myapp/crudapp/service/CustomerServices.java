package com.myapp.crudapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.crudapp.model.Customer;
import com.myapp.crudapp.repository.CustomerRepository;

@Service
public class CustomerServices {
	
	@Autowired CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer> getCustomerInfos(){
		return repository.findAll();
	}
	
	public Optional<Customer> getCustomerById(long id) {
		return repository.findById(id);
	}
	
	public boolean checkExistedCustomer(long id) {
		if(repository.existsById((long) id)) {
			return true;
		}
		return false;
	}
	
	public Customer updateCustomer(Customer customer) {
		return repository.save(customer);		
	}
	
	public void deleteCustomerById(long id) {
		repository.deleteById(id);
	}
}