package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    List<Car> carList = new ArrayList<>();

    public List<Car> getCarList() {
        carList.clear();
        carList.add(new Car("Toyota", 200, "Light"));
        carList.add(new Car("Ford", 300, "Light"));
        carList.add(new Car("Volga", 400, "Light"));
        carList.add(new Car("Honda", 250, "Light"));
        carList.add(new Car("Tesla", 600, "Light"));
        return carList;
    }
}
