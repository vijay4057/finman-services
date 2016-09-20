package com.finman.employee;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finman.exception.EmployeeNotFoundException;
import com.finman.util.Response;

/**
 * Employee Controller Class
 * 
 * @author Superuser
 *
 */
@RestController
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Resource
    EmployeeService employeeManager;

    /**
     * Returns Employee Details for given userid
     * 
     * @param id
     * @return {@link EmployeeDTO}
     */
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<EmployeeDTO> getUserDetails(@PathVariable Integer id) {
        EmployeeDTO employeeDTO;
        try {
            employeeDTO = employeeManager.getEmployeeDetails(id);
        } catch (Exception e) {
            LOGGER.error("", e);
            return Response.failure("Internal Error");
        }
        return Response.success(employeeDTO);
    }

    /**
     * Returns Employee Details for given userName
     * 
     * @param id
     * @return {@link EmployeeDTO}
     * @throws EmployeeNotFoundException 
     */
    @RequestMapping(value = "/employees/name/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<EmployeeDTO> getUserDetailsByName(@PathVariable String name) throws EmployeeNotFoundException {
        EmployeeDTO employeeDTO;
        employeeDTO = employeeManager.getEmployeeDetails(name);
        return Response.success(employeeDTO);
    }
}
