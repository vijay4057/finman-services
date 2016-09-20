package com.finman.employee;

import com.finman.exception.EmployeeNotFoundException;

/**
 * Employee Manager Interface
 * 
 * @author Superuser
 *
 */
public interface EmployeeService {
    /**
     * Returns employee details
     * 
     * @param id
     * @return {@link EmployeeDTO}}
     * @throws EmployeeNotFoundException
     */
    public EmployeeDTO getEmployeeDetails(Integer id) throws EmployeeNotFoundException;

    /**
     * Returns employee details
     * 
     * @param name
     * @return {@link EmployeeDTO}
     * @throws EmployeeNotFoundException
     */
    public EmployeeDTO getEmployeeDetails(String name) throws EmployeeNotFoundException;
}
