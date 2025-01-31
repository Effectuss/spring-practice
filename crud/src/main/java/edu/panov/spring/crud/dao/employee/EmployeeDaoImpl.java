package edu.panov.spring.crud.dao.employee;

import edu.panov.spring.crud.entity.Employee;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Employee> findAll() {
        Query<Employee> query = sessionFactory.getCurrentSession().createQuery(
                "from Employee", Employee.class
        );

        return query.getResultList();
    }
}
