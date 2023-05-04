import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//    Получить и вывести в консоль полные данные об одном из работников(имя, фамилия, пол, город) по id.
//        final String user = "postgres";
//        final String password = "frostasecs1688";
//        final String url = "jdbc:postgresql://localhost:5432/postgres";

//        try (final Connection connection =
//                     DriverManager.getConnection(url, user, password);
//             PreparedStatement statement =
//                     connection.prepareStatement("SELECT*FROM city FULL OUTER JOIN emplovee ON city.city_id = emplovee.employee_id WHERE  ID = 2;")) {
//
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                int idOfCity = resultSet.getInt("city_id");
//
//                String cityOfName = resultSet.getString("city_name");
//                String first_name = resultSet.getString("first_name");
//                String last_name = resultSet.getString("last_name");
//                String gender = resultSet.getString("gender");
//                System.out.println("ID города: " + idOfCity);
//                System.out.println("Имя: " + first_name);
//                System.out.println("Фамилия: " + last_name);
//                System.out.println("Пол: " + gender);
//                System.out.println("Город: " + cityOfName);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Ошибка при подключении к БД!");
//            e.printStackTrace();
//        }
//        Получение списка всех объектов Employee из базы.
//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        List<Employee> employeeList = employeeDAO.getAllEmployee();
//        System.out.println(employeeList);
////        Получение конкретного объекта по id
//        System.out.println(employeeDAO.getEmployeeById(1));
////        Создание сущности Employee в таблицу.
//        employeeDAO.createEmployee(new Employee(7, "Kiano", "Amson", "m", 300, 2));
////        Изменение конкретного объекта
//        employeeDAO.updateEmployee(1, new Employee(1,"Murano","Nissano","m",300,1));
//        employeeDAO.deleteEmployee(1);

//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        Collection<Employee> employeeList = employeeDAO.getAllEmployee();
//        System.out.println(employeeList);
//////        Получение конкретного объекта по id
//        System.out.println(employeeDAO.getEmployeeById(1));
//
////        Создание сущности Employee в таблицу.
//        Employee employee = new Employee("Gogar", "Magr", "m", 50, 1);
//        employeeDAO.createEmployee(employee);
//
////        Изменение конкретного объекта
//        employeeDAO.updateEmployee(new Employee(10, "KIan", "Nismo", "m", 300, 1));
//        employeeDAO.deleteEmployee(1);
////    Удаление конкретного объекта
//        employeeDAO.deleteEmployee(19,employee);

//        CityDAO cityDAO =new CityDAOImpl();
//        Collection<City>cityList = cityDAO.getAllCity();
//        System.out.println(cityList);

//        System.out.println(cityDAO.getCityById(1));

//        City city = new City("Grozny");
//        cityDAO.createCity(city);
//
//        cityDAO.updateCity(new City(5,"Grozny"));
//
//        cityDAO.deleteCity(6 ,city);


        CityDAO cityDAO = new CityDAOImpl();
        City city = new City(6, "Arlean");
        cityDAO.createCity(city);

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee( "Genri", "Forc", "m", 80, 8);
        Employee employee1 = new Employee( "Kriss", "Fox", "w", 50, 8);
//
        employeeDAO.createEmployee(employee);
        employeeDAO.createEmployee(employee1);

        cityDAO.deleteCity(8,city);


    }
}
