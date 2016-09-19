package com.finman.employee;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;

/**
 * Employee Repository Class
 * 
 * @author Superuser
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    /**
     * Find the Employee with the given id. This method will be translated into a query using the
     * {@link javax.persistence.NamedQuery} annotation at the {@link Employee} class.
     * 
     * @param id
     * @return
     */
    Employee findById(Integer id);

    /**
     * Uses {@link Optional} as return and parameter type.
     * 
     * @param name
     * @return
     */
    Optional<Employee> findByName(Optional<String> name);



    /**
     * Returns a {@link Slice} counting a maximum number of {@link Pageable#getPageSize()} Employees
     * matching given criteria starting at {@link Pageable#getOffset()} without prior count of the
     * total number of elements available.
     * 
     * @param name
     * @param page
     * @return
     */
    Slice<Employee> findByNameOrderByNameAsc(String name, Pageable page);

}
