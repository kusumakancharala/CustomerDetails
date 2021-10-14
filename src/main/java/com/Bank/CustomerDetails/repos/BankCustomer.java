package com.Bank.CustomerDetails.repos;

import com.Bank.CustomerDetails.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BankCustomer extends JpaRepository<Bank, Long> {
}
