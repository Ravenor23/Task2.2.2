package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = carService.getCarList();

        if (count != null && count < 5 && count >= 0) {
            int counter = 4;
            while (carList.size() > count) {
                carList.remove(counter--);
            }
        } else if (count!= null && count < 0) {

        }

        model.addAttribute(carList);
        return "carList";
    }
}
