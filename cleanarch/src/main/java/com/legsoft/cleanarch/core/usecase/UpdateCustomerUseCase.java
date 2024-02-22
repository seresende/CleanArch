package com.legsoft.cleanarch.core.usecase;

import com.legsoft.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
