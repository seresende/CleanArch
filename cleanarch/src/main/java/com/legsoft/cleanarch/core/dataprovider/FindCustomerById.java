package com.legsoft.cleanarch.core.dataprovider;

import com.legsoft.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
