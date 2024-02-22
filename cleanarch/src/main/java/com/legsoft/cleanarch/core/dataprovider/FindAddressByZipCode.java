package com.legsoft.cleanarch.core.dataprovider;

import com.legsoft.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
