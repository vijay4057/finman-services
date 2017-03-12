package com.finman.customer;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    CustomerRepository customerRepository;

    @Override
    public CustomerDTO getCustomer(Integer id) {
        Customer customer = customerRepository.findOne(id);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(customer, CustomerDTO.class);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        Iterable<Customer> customer = customerRepository.findAll();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(customer, List.class);
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.convertValue(customerDTO, Customer.class);
        customer.setCreatedDate(new Date());
        customerRepository.save(customer);
        customerDTO.setId(customer.getId());
    }

}
