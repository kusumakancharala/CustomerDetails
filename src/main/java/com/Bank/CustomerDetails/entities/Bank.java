package com.Bank.CustomerDetails.entities;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table(name="Bank")
public class Bank {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  Customerid;

    private String Customername;
    private String Customerdetails;
    private String Customermobilenumber;

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

    public String getCustomerdetails() {
        return Customerdetails;
    }

    public void setCustomerdetails(String customerdetails) {
        Customerdetails = customerdetails;
    }

    public String getCustomermobilenumber() {
        return Customermobilenumber;
    }

    public void setCustomermobilenumber(String customermobilenumber) {
        Customermobilenumber = customermobilenumber;
    }
    @Override
    public String toString() {
        return "Bank{" +
                "Customerid=" + Customerid +
                ", Customername='" + Customername + '\'' +
                ", Customerdetails='" + Customerdetails + '\'' +
                ", Customermobilenumber='" + Customermobilenumber + '\'' +
                '}';
    }
}
