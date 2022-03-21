package com.SpringBootCrudExample.SpringBootCrudExample.controller;


import com.SpringBootCrudExample.SpringBootCrudExample.entity.Customer;
import com.SpringBootCrudExample.SpringBootCrudExample.service.CustumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustumerService custumerService;



    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@ResponseBody Customer customer){
        Customer addCustomer = custumerService.addCustomer(custumer);
        return new ResponseEntity<Customer>(addCustomer, HttpStatus.CREATED);
    }

    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> allCustomer = custumerService.findAllCustomer();
        return new ResponseEntity<List<Customer>>(allCustomer,HttpStatus.OK);
    }
    public ResponseEntity<Customer> getCustomerId(@PathVariable(id)Long id){
        Customer customerById = custumerService.getCustomerById(id);
        return new ResponseEntity<Customer>(customerById,HttpStatus.OK);
    }
    public ResponseEntity<Void> deleteCustomerById(@PathVariable("id")Long id){
        custumerService.deleteCustomerById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
