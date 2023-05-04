import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer city_id;
    @Column(name = "city_name")
    private String name_city;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private List<Employee> employeeList;

    public City() {
        this.city_id = city_id;
        this.name_city = name_city;
    }

    public City(String name_city) {
        this.city_id = city_id;
        this.name_city = name_city;
    }

    public City(int city_id, String name_city) {
        this.city_id = city_id;
        this.name_city = name_city;
    }

    public Integer getId() {
        return city_id;
    }

    public void setId(int id) {
        this.city_id = city_id;
    }

    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + city_id +
                ", name_city='" + name_city + '\'' +
                '}';
    }
}
