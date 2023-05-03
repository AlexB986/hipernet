import javax.persistence.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    private final String user = "postgres";
    private final String password = "postgres";
    private final String url = "jdbc:postgresql://localhost:5432/postgres";

    @Override
    //TODO Получение списка всех объектов Employee из базы.
    public Collection<Employee> getAllEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Query query = entityManager.createNativeQuery("SELECT * FROM emplovee", Employee.class);

        return query.getResultList();

    }

    @Override
    //TODO Получение конкретного объекта по id
    public Employee getEmployeeById(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    //TODO Создание сущности Employee в таблицу.
    public void createEmployee(Employee employee) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


    }

    @Override
    public void updateEmployee(Employee employee) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.merge(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }

    @Override
    public void deleteEmployee(int id,Employee employee) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        employee = entityManager.find(Employee.class,id );
        entityManager.remove(employee);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }




}
