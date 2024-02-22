package com.legsoft.cleanarch.entrypoint.controller;

import com.legsoft.cleanarch.core.usecase.DeleteCustomerUseCase;
import com.legsoft.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.legsoft.cleanarch.core.usecase.InsertCustomerUseCase;
import com.legsoft.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.legsoft.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.legsoft.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.legsoft.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/customers")
public class CustomerController {

    //Inferface para acessar o core
    @Autowired
    InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    DeleteCustomerUseCase deleteCustomerUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        insertCustomerUseCase.insert(customerMapper.toCustomer(customerRequest), customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteCustomerUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
