package web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarsController {
    List<Car> carList = new ArrayList<>();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        carList.clear();
        carList.add(new Car("Toyota", 200, "Light"));
        carList.add(new Car("Ford", 300, "Light"));
        carList.add(new Car("Volga", 400, "Light"));
        carList.add(new Car("Honda", 250, "Light"));
        carList.add(new Car("Tesla", 600, "Light"));

        if (count != null && count < 5) {
            int counter = 4;
            while (carList.size() > count) {
                carList.remove(counter--);
            }
        }

        model.addAttribute(carList);
        return "carList";
    }
}
