package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

    Employee getEmployeeById(long id);

    void saveEmployee(Employee employee);

    void deleteEmployeeById(long id);
}
