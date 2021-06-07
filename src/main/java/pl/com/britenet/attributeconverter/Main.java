package pl.com.britenet.attributeconverter;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.com.britenet.attributeconverter.model.Employee;
import pl.com.britenet.attributeconverter.service.EmployeeService;

@Configuration
@ComponentScan(basePackages = "pl.com.britenet.attributeconverter")
public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
    EmployeeService service = applicationContext.getBean(EmployeeService.class);

    /*
     * Create Employee1
     */
    Employee employee1 = new Employee();
    employee1.setFirstName("Jan");
    employee1.setLastName("Nowak");

    /*
     * Create Employee2
     */
    Employee employee2 = new Employee();
    employee2.setFirstName("Piotr");
    employee2.setLastName("Kowalski");

    /*
     * Persist both Employees
     */
    service.saveEmployee(employee1);
    service.saveEmployee(employee2);

    /*
     * Get all employees list from database
     */
    List<Employee> employees = service.findAllEmployees();
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }
}
