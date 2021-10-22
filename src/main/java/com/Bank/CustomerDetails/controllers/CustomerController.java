package com.Bank.CustomerDetails.controllers;

import com.Bank.CustomerDetails.entities.Bank;
import com.Bank.CustomerDetails.exceptions.MyExceptions;
import com.Bank.CustomerDetails.exceptions.SimpleConfig;
import com.Bank.CustomerDetails.exceptions.SimpleError;
import com.Bank.CustomerDetails.repos.BankCustomer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private BankCustomer bankCustomer;
    @Autowired
    private SimpleConfig simpleConfig;
        @RequestMapping(value = "/add/", method = RequestMethod.POST)
        public Bank createCustomer(@RequestBody Bank bank) {

            return bankCustomer.save(bank);
        }

        @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
        public Bank getCustomer(@PathVariable("id") String id) {


            List<SimpleError> simpleErrors= simpleConfig.getSimplerrors();
            SimpleError objOneExceptionPRoperties = simpleErrors.get(0);
//            Map<String, Bank> map = new HashMap<>();
            Bank data = null;
            long l = 0L;
            try {
                l = Long.parseLong(id);
            } catch (Exception e) {
                throw new MyExceptions(objOneExceptionPRoperties.getMessage() + " " + id, objOneExceptionPRoperties.getAction(), objOneExceptionPRoperties.getHttpCode());
            }

            try {

                data = bankCustomer.findById(l).get();
            } catch (Exception E) {
                throw new MyExceptions(objOneExceptionPRoperties.getMessage() + " " + id, objOneExceptionPRoperties.getAction(), objOneExceptionPRoperties.getHttpCode());
            }

//            map.put("Bank", data);
//            return map;
            return data;
        }


        @RequestMapping(value = "/updateemp/", method = RequestMethod.PUT)
        public Bank updateCustomer(@RequestBody Bank bank) {
            Bank existingCustomer = null;
            try {
                existingCustomer = bankCustomer.findById(bank.getCustomerid()).orElse(null);
            } catch (Exception e) {
                throw new MyExceptions("please provide customer id ", "Example :- customeridmg: 14,");
            }
            existingCustomer.setCustomerid(bank.getCustomerid());
            existingCustomer.setCustomername(bank.getCustomername());
            existingCustomer.setCustomerdetails(bank.getCustomerdetails());
            existingCustomer.setCustomermobilenumber(bank.getCustomermobilenumber());
            return bankCustomer.save(bank);
        }

        @RequestMapping(value = "/findallsorting/", method = RequestMethod.GET)
        public RootClass findallsorting() throws JsonProcessingException {
            List<Bank> list2 = (List<Bank>) bankCustomer.findAll();

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

            List<Bank> list = (List<Bank>) bankCustomer.findAll();

            RootClass collection = new RootClass(list);
            return collection;
        }
//        public List<Bank> findallsorting() {
//
////            Map<String, List<Bank>> map = new HashMap<>();
////            map.put("Bank", (List<Bank>) bankCustomer.findAll());
////            return map;
//            return bankCustomer.findAll();
//        }

    }
