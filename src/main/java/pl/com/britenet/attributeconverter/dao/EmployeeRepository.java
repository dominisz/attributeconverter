package pl.com.britenet.attributeconverter.dao;

import java.util.List;
import pl.com.britenet.attributeconverter.model.Employee;

public interface EmployeeRepository {

  void saveEmployee(Employee employee);

  List<Employee> findAllEmployees();
}
