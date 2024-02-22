package com.legsoft.cleanarch.dataprovider;

import com.legsoft.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.legsoft.cleanarch.core.domain.Address;
import com.legsoft.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.legsoft.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        return addressResponseMapper.toAddress(findAddressByZipCodeClient.find(zipCode));
    }
}
