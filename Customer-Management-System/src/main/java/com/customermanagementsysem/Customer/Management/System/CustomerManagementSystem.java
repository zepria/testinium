package com.customermanagementsysem.Customer.Management.System;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.customermanagementsysem")
//@EnableJpaRepositories(basePackages = "com.customermanagementsysem")


public class CustomerManagementSystem {
    public static void main(String[]args) {
        SpringApplication.run(CustomerManagementSystem.class, args);
    }
}
