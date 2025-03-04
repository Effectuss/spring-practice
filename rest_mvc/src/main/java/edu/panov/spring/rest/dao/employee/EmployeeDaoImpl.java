package edu.panov.spring.rest.dao.employee;

import edu.panov.spring.rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public void add(Employee employee) {
        Session currentSession = sessionFactory.getCurrentSession();

        System.out.println("ADD " + employee.getId());

        currentSession.merge(employee);
    }

    @Override
    public Optional<Employee> get(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        System.out.println("GET " + Optional.of(currentSession.get(Employee.class, id).getId()).get().toString());
        return Optional.of(currentSession.get(Employee.class, id));
    }

    @Override
    public void delete(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.createMutationQuery("delete from Employee where id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
