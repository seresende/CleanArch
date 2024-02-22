package com.legsoft.cleanarch.entrypoint.controller.mapper;

import com.legsoft.cleanarch.core.domain.Customer;
import com.legsoft.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.legsoft.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
