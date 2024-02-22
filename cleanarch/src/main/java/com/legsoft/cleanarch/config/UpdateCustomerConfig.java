package com.legsoft.cleanarch.config;

import com.legsoft.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.legsoft.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.legsoft.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.legsoft.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCaseImpl(
        FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
        FindAddressByZipCodeImpl findAddressByZipCode,
        UpdateCustomerImpl updateCustomer
    ){

        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
