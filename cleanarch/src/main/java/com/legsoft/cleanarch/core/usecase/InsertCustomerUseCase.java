package com.legsoft.cleanarch.core.usecase;

import com.legsoft.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
