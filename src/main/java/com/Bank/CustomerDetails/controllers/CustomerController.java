package com.Bank.CustomerDetails.controllers;

import com.Bank.CustomerDetails.customerexceptions.CutomException;
import com.Bank.CustomerDetails.entities.Bank;
import com.Bank.CustomerDetails.repos.BankCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    BankCustomer bankCustomer;

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public ResponseEntity<Bank> createCustomer(@RequestBody Bank bank) {

        Bank custom =bankCustomer.save(bank);
        return new ResponseEntity<Bank> (custom, HttpStatus.OK);
    }
    @RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
    public ResponseEntity<Bank> getCustomerById(@PathVariable("id") Long id) {

        Bank custom = bankCustomer.findById(id).get();
        return new ResponseEntity<Bank>(custom,HttpStatus.OK);
    }
    @RequestMapping(value = "/deletebyid/{id}", method = RequestMethod.DELETE)
    public void deleteCustomerById(@PathVariable("id") Long id) {
        bankCustomer.deleteById(id);
    }

    @RequestMapping(value = "/findallbank/", method = RequestMethod.GET)
    public ResponseEntity<List<Bank>> getCustomers() throws CutomException {

        if(bankCustomer.findAll().isEmpty()){
            throw new CutomException();
        }

        List<Bank> custom = bankCustomer.findAll();
        return new ResponseEntity<List<Bank>>(custom,HttpStatus.OK);
    }

    @RequestMapping(value = "/updatebank/", method = RequestMethod.PUT)
    public ResponseEntity<Bank> updateCustomer(@RequestBody Bank bank) {

        Bank custom = bankCustomer.save(bank);
        return new ResponseEntity<Bank>(custom,HttpStatus.OK);
    }
}

