package pl.com.britenet.attributeconverter.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.britenet.attributeconverter.dao.EmployeeRepository;
import pl.com.britenet.attributeconverter.model.Employee;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EmployeeServiceImpl implements EmployeeService {

  private final EmployeeRepository employeeRepository;

  public void saveEmployee(Employee employee) {
    employeeRepository.saveEmployee(employee);
  }

  public List<Employee> findAllEmployees() {
    return employeeRepository.findAllEmployees();
  }
}
