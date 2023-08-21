package com.customermanagementsysem.Customer.Management.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(String isim, String soyIsim, String eposta, String telefon, Long id, String customerType) {
        Customer customer = new Customer(isim, soyIsim, eposta, telefon, id, customerType);
        customerRepository.save(customer);
    }

    public void addCorporateCustomer(String isim, String soyIsim, String eposta, String telefon,
                                     String vergiNo,String kurulusTarihi, Long id, String customerType)

    {
        CorporateCustomer corporateCustomer = new CorporateCustomer(isim, soyIsim, eposta, telefon, vergiNo,
                kurulusTarihi,id, customerType);
        customerRepository.save(corporateCustomer);
    }

    public void addIndividualCustomer(String isim, String soyIsim, String eposta, String telefon,
                                      String tcKimlikNo,String dogumTarihi, Long id, String customerType)
    {
        IndividualCustomer individualCustomer = new IndividualCustomer(isim, soyIsim, eposta, telefon,
                tcKimlikNo,dogumTarihi, id, customerType);
        customerRepository.save(individualCustomer);
    }

    public void updateCustomer(Long customerId, String isim, String soyIsim, String eposta, String telefon,
                               String customerType) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setIsim(isim);
            customer.setSoyIsim(soyIsim);
            customer.setEposta(eposta);
            customer.setTelefon(telefon);
            customer.setCustomerType(customerType);
            customerRepository.save(customer);
        } else {
            throw new RuntimeException("Müşteri bulunamadı: " + customerId);
        }
    }

    public void saveCustomer(Long customerId) {
        customerRepository.saveById(customerId);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> searchCustomersByName(String name) {
        return customerRepository.findByIsimContainingIgnoreCase(name);
    }
    public List<Customer> searchCustomersByLastName(String lastName) {
        return customerRepository.findBySoyIsimContainingIgnoreCase(lastName);
    }
    public List<Customer> searchCustomersByEposta(String eposta) {
        return customerRepository.findByEposta(eposta);
    }

    public List<Customer> searchCustomersByTelefon(String telefon) {
        return customerRepository.findByTelefonContaining(telefon);
    }

    public List<Customer> getIndividualCustomers() {
        return customerRepository.findByCustomerType("Individual");
    }

    public List<Customer> getCorporateCustomers(){
        return customerRepository.findByCustomerType("Corporate");
    }
}