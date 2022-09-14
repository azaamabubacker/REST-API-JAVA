package com.icbt.customerapi.service;

import com.icbt.customerapi.model.Customer;

public interface CustomerService {
  Customer saveCustomer (Customer customer);




  Customer getCustomer(Long id);
}
