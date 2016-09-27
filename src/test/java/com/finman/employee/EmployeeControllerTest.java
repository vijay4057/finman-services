package com.finman.employee;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.finman.Application;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class EmployeeControllerTest {

    @Mock
    EmployeeService employeeManager;

    @MockBean
    Employee employee;

    @Before
    public void setUp() {
        employee.setCity("Chennai");
    }
    
    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void testGetUserDetails() {
        when(employeeRepository.findById(anyInt())).thenReturn(employee);
        EmployeeDTO employeeDetails = employeeManager.getEmployeeDetails(4);
        assertThat(employee.getCity()).isEqualTo("Chennai");
    }


}
