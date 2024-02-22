package com.legsoft.cleanarch.dataprovider;

import com.legsoft.cleanarch.core.dataprovider.DeleteCustomer;
import com.legsoft.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DeleteCustomerImpl implements DeleteCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }
}
