package com.legsoft.cleanarch.core.usecase;

import com.legsoft.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
