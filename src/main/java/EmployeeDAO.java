import java.util.Collection;
import java.util.List;

public interface EmployeeDAO {
    Collection<Employee> getAllEmployee();

    Employee getEmployeeById(int id);

    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id,Employee employee);


}

