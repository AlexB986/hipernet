import java.util.Collection;

public interface CityDAO {
    Collection<City> getAllCity();

    City getCityById(int id);

    void createCity(City city);

    void updateCity(City city);

    void deleteCity(int id,City city);
}
