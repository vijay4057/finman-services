package com.finman.employee;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    EmployeeManager employeeManager;

    /**
     * Returns Employee Details for given uerid
     * 
     * @param id
     * @return {@link EmployeeDTO}
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
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
}
