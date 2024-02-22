package com.legsoft.cleanarch.dataprovider.repository.mapper;

import com.legsoft.cleanarch.core.domain.Customer;
import com.legsoft.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
