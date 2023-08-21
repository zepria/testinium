package com.customermanagementsysem.Customer.Management.System;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/musteri")
public class Controls {

    private final CustomerService customerService;

    @Autowired
    public Controls(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomer() {
        return "Musteri bilgileri";
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer.getIsim(), customer.getSoyIsim(), customer.getEposta(), customer.getTelefon(),
                customer.getId() ,customer.getCustomerType());
    }

    @PostMapping("/add-corporate")
    public void
    addCorporateCustomer (@RequestBody CorporateCustomer corporateCustomer) {
        customerService.addCorporateCustomer(
                corporateCustomer.getIsim(),
                corporateCustomer.getSoyIsim(),
                corporateCustomer.getEposta(),
                corporateCustomer.getTelefon(),
                corporateCustomer.getVergiNo(),
                corporateCustomer.getKurulusTarihi(),
                corporateCustomer.getId(),
                corporateCustomer.getCustomerType());
    }

    @PostMapping("/add-individual")
    public void addIndividualCustomer(@RequestBody IndividualCustomer individualCustomer) {
        customerService.addIndividualCustomer(
                individualCustomer.getIsim(),
                individualCustomer.getSoyIsim(),
                individualCustomer.getTelefon(),
                individualCustomer.getEposta(),
                individualCustomer.getTcKimlikNo(),
                individualCustomer.getDogumTarihi(),
                individualCustomer.getId(),
                individualCustomer.getCustomerType());

    }



    @PutMapping("/update/{customerId}")
    public void updateCustomer(@PathVariable Long customerId, @RequestBody Customer customer) {
        customerService.updateCustomer(customerId, customer.getIsim(), customer.getSoyIsim(), customer.getEposta(), customer.getTelefon(),
                customer.getCustomerType());
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);
    }

    @DeleteMapping("/save/{customerId}")
    public void saveCustomer(@PathVariable Long customerId) {
        customerService.saveCustomer(customerId);
    }

    @GetMapping("/search-by-name")
    public List<Customer> searchCustomersByName(@RequestParam String Name) {
        return customerService.searchCustomersByName(Name);
    }

    @GetMapping("/search-by-lastname")
    public List<Customer> searchCustomersByLastName(@RequestParam String lastName) {
        return customerService.searchCustomersByLastName(lastName);
    }

    @GetMapping("/search-by-email")
    public List<Customer> searchCustomersByEposta(@RequestParam String email) {
        return customerService.searchCustomersByEposta(email);
    }

    @GetMapping("/search-by-telefon")
    public List<Customer> searchCustomersByTelefon(@RequestParam String telefon) {
        return customerService.searchCustomersByTelefon(telefon);
    }

    @GetMapping("/individual-customers")
    public List<Customer> getIndividualCustomers(){
        return customerService.getIndividualCustomers();
    }

    @GetMapping("/corporate-customers")
    public List<Customer> getCorporateCustomers(){
        return customerService.getCorporateCustomers();
    }
}