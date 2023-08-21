package com.customermanagementsysem.Customer.Management.System;

import java.util.Objects;

public class IndividualCustomer extends Customer {

    private String tcKimlikNo;
    private String dogumTarihi;

    public IndividualCustomer(String isim, String soyIsim, String eposta, String telefon,
                              String tcKimlikNo, String dogumTarihi, Long id, String customerType) {
        super(isim, soyIsim, eposta, telefon,id, customerType);
        this.tcKimlikNo = tcKimlikNo;
        this.dogumTarihi = dogumTarihi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "BireyselMusteri{" +
                "tcKimlikNo='" + tcKimlikNo + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndividualCustomer)) return false;
        if (!super.equals(o)) return false;
        IndividualCustomer that = (IndividualCustomer) o;
        return Objects.equals(tcKimlikNo, that.tcKimlikNo) &&
                Objects.equals(dogumTarihi, that.dogumTarihi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tcKimlikNo, dogumTarihi);
    }
}