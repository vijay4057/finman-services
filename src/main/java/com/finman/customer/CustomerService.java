package com.finman.customer;

import java.util.List;

public interface CustomerService {
    
    public CustomerDTO getCustomer(Integer id);

    public List<CustomerDTO> getAllCustomers();

    public void saveCustomer(CustomerDTO customerDTO);

}
