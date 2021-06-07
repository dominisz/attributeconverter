package pl.com.britenet.attributeconverter.service;

import java.util.List;
import pl.com.britenet.attributeconverter.model.Employee;

public interface EmployeeService {

  void saveEmployee(Employee employee);

  List<Employee> findAllEmployees();
}
