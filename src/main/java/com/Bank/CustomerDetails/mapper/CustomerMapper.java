package com.Bank.CustomerDetails.mapper;

import com.Bank.CustomerDetails.dto.BankDto;
import com.Bank.CustomerDetails.entities.Bank;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    BankDto modelToDto(Bank bank);
    Bank DtoToModel(BankDto bankDto);

}
