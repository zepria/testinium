package com.customermanagementsysem.Customer.Management.System;

import java.util.Objects;

public class CorporateCustomer extends Customer {

    private String vergiNo;
    private String kurulusTarihi;

    public CorporateCustomer(String isim, String soyIsim, String eposta, String telefon, String vergiNo,
                             String kurulusTarihi, Long id, String customerType) {
        super(isim, soyIsim, eposta, telefon, id, customerType);
        this.vergiNo = vergiNo;
        this.kurulusTarihi = kurulusTarihi;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getKurulusTarihi() {
        return kurulusTarihi;
    }

    public void setKurulusTarihi(String kurulusTarihi) {
        this.kurulusTarihi = kurulusTarihi;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "vergiNo='" + vergiNo + '\'' +
                ", kurulusTarihi='" + kurulusTarihi + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CorporateCustomer)) return false;
        if (!super.equals(o)) return false;
        CorporateCustomer that = (CorporateCustomer) o;
        return Objects.equals(vergiNo, that.vergiNo) &&
                Objects.equals(kurulusTarihi, that.kurulusTarihi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vergiNo, kurulusTarihi);
    }
}