package com.legsoft.cleanarch.config;

import com.legsoft.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.legsoft.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCaseImpl(
        FindCustomerByIdImpl findCustomerById
    ){

        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
