package com.customermanagementsysem.Customer.Management.System;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CustomerRepository
extends JpaRepository<Customer, Long>{

    List<Customer> findByIsimContainingIgnoreCase(@Nonnull String name);

    List<Customer> findBySoyIsimContainingIgnoreCase(@Nonnull String lastName);

    List<Customer> findByEposta(@Nonnull String eposta);

    List<Customer> findByTelefonContaining(@Nonnull String telefon);

    List<Customer> findByCustomerType(@Nonnull String customerType);
     @Override
     @SuppressWarnings("nullness")

     void deleteById(@Nonnull Long id);
     void saveById(@Nonnull Long id);

    <S extends Customer> @Nonnull S save(@Nonnull S customer);

}
