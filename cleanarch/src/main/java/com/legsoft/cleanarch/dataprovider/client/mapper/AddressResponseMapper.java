package com.legsoft.cleanarch.dataprovider.client.mapper;

import com.legsoft.cleanarch.core.domain.Address;
import com.legsoft.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
