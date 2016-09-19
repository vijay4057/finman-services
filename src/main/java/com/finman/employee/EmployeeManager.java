package com.finman.employee;

import java.util.List;

/**
 * Employee Manager Interface
 * 
 * @author Superuser
 *
 */
public interface EmployeeManager {
    /**
     * Returns employee details
     * 
     * @param id
     * @return {@link EmployeeDTO}}
     */
    public EmployeeDTO getEmployeeDetails(Integer id);

    /**
     * Returns employee details
     * 
     * @param name
     * @return {@link EmployeeDTO} List
     */
    public List<EmployeeDTO> getEmployeeDetailsByName(String name);
}
