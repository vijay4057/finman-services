package com.finman.employee;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Employee Manager Impl Class
 * 
 * @author Superuser
 *
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Resource
    EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public EmployeeDTO getEmployeeDetails(Integer id) {
        Employee employee = employeeRepository.findById(id);
        ObjectMapper mapper = new ObjectMapper();
        EmployeeDTO employeeDTO = mapper.convertValue(employee, EmployeeDTO.class);
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> getEmployeeDetailsByName(String name) {
        return null;
    }

}
