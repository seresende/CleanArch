package com.legsoft.cleanarch.config;

import com.legsoft.cleanarch.core.usecase.impl.DeleteCustomerUseCaseImpl;
import com.legsoft.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.legsoft.cleanarch.dataprovider.DeleteCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerUseCaseImpl deleteCustomerUseCaseImpl(
        FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
        DeleteCustomerImpl deleteCustomer
    ){

        return new DeleteCustomerUseCaseImpl(findCustomerByIdUseCase, deleteCustomer);
    }
}
