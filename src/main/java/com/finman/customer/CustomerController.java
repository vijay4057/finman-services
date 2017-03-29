package com.finman.customer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finman.util.Response;

@RestController
public class CustomerController {

    @Resource
    CustomerService customerService;

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<CustomerDTO>> getCustomer(@PathVariable Integer id) {
        CustomerDTO customer = customerService.getCustomer(id);
        return Response.success(customer);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<List<CustomerDTO>>> getAllCustomers() {
        List<CustomerDTO> customer = customerService.getAllCustomers();
        return Response.success(customer);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerDTO.setCreatedBy("1");
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity<>(customerDTO.getCustId(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<Object>> saveCustomerById(@PathVariable Integer id, @RequestBody CustomerDTO customerDTO) {
        customerDTO.setId(id);
        customerService.saveCustomer(customerDTO);
        return Response.success(HttpStatus.OK);
    }
}
