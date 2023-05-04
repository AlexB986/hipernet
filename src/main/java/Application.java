import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {


        CityDAO cityDAO =new CityDAOImpl();
        Collection<City>cityList = cityDAO.getAllCity();
        System.out.println(cityList);
        System.out.println(cityDAO.getCityById(1));

        City city = new City("Grozny");
        cityDAO.createCity(city);

        cityDAO.updateCity(new City(6,"Grozny"));

        cityDAO.deleteCity(6 ,city);


        CityDAO cityDAO = new CityDAOImpl();
        City city = new City( "Arlean");
        cityDAO.createCity(city);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee( "Genri", "Forc", "m", 80, 9);
        Employee employee1 = new Employee( "Kriss", "Fox", "w", 50, 9);


        employeeDAO.updateEmployee(new Employee(24, "Kran", "Buldozer", "m", 300, 1));


        employeeDAO.createEmployee(employee);
        employeeDAO.createEmployee(employee1);

        cityDAO.deleteCity(9,city);

    }
}
