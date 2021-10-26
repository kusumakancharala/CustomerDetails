package com.Bank.CustomerDetails.mapper;

import com.Bank.CustomerDetails.dto.BankDto;
import com.Bank.CustomerDetails.entities.Bank;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
//    Basic mapping
//    @Mapping(target = "id", source = "customerid")
//    @Mapping(target = "name", source = "customername")
//    public BankDto bankToBankdto(Bank bank);
//
//    Bank bankDtoToBank(BankDto bankDto);

//    Custom Mapping
    @Mapping(source = "id", target = "customerid", qualifiedByName = "idTocustomerid")
    public Bank CustomerMapper(BankDto dto);

    @Named("idTocustomerid")
    public static double idTocustomerid(Long id) {
        return id ;
    }

//    Complex Mapping


}
