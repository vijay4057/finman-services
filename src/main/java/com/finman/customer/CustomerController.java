package com.finman.customer;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.finman.employee.EmployeeDTO;
import com.finman.employee.EmployeeService;
import com.finman.util.Response;

public class CustomerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Resource
    CustomerService customerService;

    /**
     * Returns Customer Details for given userid
     * 
     * @param id
     * @return {@link CustomerDTO}
     */
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<Customer> getCustomerDetails(@PathVariable Integer id) {
        Customer customerDTO;
        try {
            customerDTO = (Customer) customerService.findOne(id);
        } catch (Exception e) {
            LOGGER.error("", e);
            return Response.failure("Internal Error");
        }
        return Response.success(customerDTO);
    }
}
