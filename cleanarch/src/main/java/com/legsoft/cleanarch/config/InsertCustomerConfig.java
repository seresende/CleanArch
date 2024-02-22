package com.legsoft.cleanarch.config;

import com.legsoft.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.legsoft.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.legsoft.cleanarch.dataprovider.InsertCustomerImpl;
import com.legsoft.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCaseImpl(
        FindAddressByZipCodeImpl findAddressByZipCode,
        InsertCustomerImpl insertCustomer,
        SendCpfForValidationImpl sendCpfForValidation
    ){

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
