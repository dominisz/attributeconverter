package pl.com.britenet.attributeconverter.dao;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.com.britenet.attributeconverter.model.Employee;

@Repository
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EmployeeRepositoryImpl implements EmployeeRepository {

  private final SessionFactory sessionFactory;

  private Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  private void persist(Object entity) {
    getSession().persist(entity);
  }

  public void saveEmployee(Employee employee) {
    persist(employee);
  }

  public List<Employee> findAllEmployees() {
    Criteria criteria = getSession().createCriteria(Employee.class);
    return (List<Employee>) criteria.list();
  }
}
