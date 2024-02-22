package com.legsoft.cleanarch.dataprovider;

import com.legsoft.cleanarch.core.dataprovider.FindCustomerById;
import com.legsoft.cleanarch.core.domain.Customer;
import com.legsoft.cleanarch.dataprovider.repository.CustomerRepository;
import com.legsoft.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        //para cada entidade dentro do Optional e transformado em customer
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
