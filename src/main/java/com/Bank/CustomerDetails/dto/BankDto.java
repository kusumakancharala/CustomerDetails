package com.Bank.CustomerDetails.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class BankDto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long  id;
    private String name;
    private String mobilenumber;

//    public Long getCustomerid() {
//        return Customerid;
//    }
//
//    public void setCustomerid(Long customerid) {
//        Customerid = customerid;
//    }
//
//    public String getCustomername() {
//        return Customername;
//    }
//
//    public void setCustomername(String customername) {
//        Customername = customername;
//    }
//
//    public String getCustomermobilenumber() {
//        return Customermobilenumber;
//    }
//
//    public void setCustomermobilenumber(String customermobilenumber) {
//        Customermobilenumber = customermobilenumber;
//    }


}
