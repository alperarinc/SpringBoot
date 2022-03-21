package com.SpringBootCrudExample.SpringBootCrudExample.service;

import com.SpringBootCrudExample.SpringBootCrudExample.entity.Customer;
import com.SpringBootCrudExample.SpringBootCrudExample.repositroy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustumerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long customerId){
        return customerRepository.findById(customerId).get();
    }
    public Customer deleteCustomerById(Long customerId){
        customerRepository.deleteById(customerId);
    }




}
