package com.legsoft.cleanarch.dataprovider.repository.entity;

import com.legsoft.cleanarch.core.domain.Address;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class AddressEntity {

    private String street;
    private String city;
    private String state;
}
