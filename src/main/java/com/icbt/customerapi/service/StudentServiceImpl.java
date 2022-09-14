package com.icbt.customerapi.service;

import com.icbt.customerapi.entity.CustomerEntity;
import com.icbt.customerapi.model.Customer;
import com.icbt.customerapi.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public StudentServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        BeanUtils.copyProperties(customer, customerEntity);
        customerRepository.save(customerEntity);
        return customer;
    }

    @Override
    public Customer getCustomer(Long id) {
        CustomerEntity customerEntity =
                customerRepository.findById(id).get();
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerEntity, customer);
        return customer;
    }
}
