package com.SpringBootCrudExample.SpringBootCrudExample.repositroy;

import com.SpringBootCrudExample.SpringBootCrudExample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
