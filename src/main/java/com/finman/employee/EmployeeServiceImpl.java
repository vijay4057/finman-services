package com.finman.employee;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finman.exception.EmployeeNotFoundException;

/**
 * The Employee Manager Impl Class
 * 
 * @author Superuser
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO getEmployeeDetails(Integer id) throws EmployeeNotFoundException {
        Employee employee = employeeRepository.findById(id);
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(employee, EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO getEmployeeDetails(String name) throws EmployeeNotFoundException {
        Employee employee = employeeRepository.findByName(name);
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(employee, EmployeeDTO.class);
    }

}
