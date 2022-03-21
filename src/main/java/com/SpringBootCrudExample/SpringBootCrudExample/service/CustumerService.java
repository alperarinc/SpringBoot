package com.SpringBootCrudExample.SpringBootCrudExample.service;

import com.SpringBootCrudExample.SpringBootCrudExample.entity.Customer;
import com.SpringBootCrudExample.SpringBootCrudExample.exception.CustomerNotFoundException;
import com.SpringBootCrudExample.SpringBootCrudExample.exception.CustomerNotNullException;
import com.SpringBootCrudExample.SpringBootCrudExample.repositroy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustumerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){

        if(customer.getName().isBlank() || customer.getName().isEmpty() || customer.getSurname().isEmpty() || customer.getSurname().isBlank()){
            throw new CustomerNotNullException("Customer name and surname must be not null");

        }
        return customerRepository.save(customer);
    }
    public List<Customer> findAllCustomer(){

        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long customerId){
        Optional<Customer> optionalCustomer=customerRepository.findById(customerId);
        Customer customer = optionalCustomer.orElseThrow(()-> new CustomerNotFoundException("Customer Id : "+ customerId));
        return customer;

      //  return customerRepository.findById(customerId).get();
    }
    public void deleteCustomerById(Long customerId){

        customerRepository.deleteById(customerId);
    }
}
