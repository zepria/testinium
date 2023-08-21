package com.customermanagementsysem.Customer.Management.System;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name= "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String isim;
	private String soyIsim;
	private String eposta;
	private String telefon;
	private String customerType;

	public Customer() {
	}

	public Customer(String isim, String soyIsim, String eposta, String telefon, Long id, String customerType) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.eposta = eposta;
		this.telefon = telefon;
		this.customerType = customerType;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", isim='" + isim + '\'' +
				", soyIsim='" + soyIsim + '\'' +
				", eposta='" + eposta + '\'' +
				", telefon='" + telefon + '\'' +
				", customerType='" + customerType + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Customer)) return false;
		Customer customer = (Customer) o;
		return Objects.equals(id, customer.id) &&
				Objects.equals(isim, customer.isim) &&
				Objects.equals(soyIsim, customer.soyIsim) &&
				Objects.equals(eposta, customer.eposta) &&
				Objects.equals(telefon, customer.telefon) &&
				Objects.equals(customerType, customer.customerType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isim, soyIsim, eposta, telefon, customerType);
	}
}