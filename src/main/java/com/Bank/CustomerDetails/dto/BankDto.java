package com.Bank.CustomerDetails.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BankDto {
    public Long getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(Long customerid) {
        Customerid = customerid;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getCustomermobilenumber() {
        return Customermobilenumber;
    }

    public void setCustomermobilenumber(String customermobilenumber) {
        Customermobilenumber = customermobilenumber;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long  Customerid;
    private String Customername;
    private String Customermobilenumber;
}
