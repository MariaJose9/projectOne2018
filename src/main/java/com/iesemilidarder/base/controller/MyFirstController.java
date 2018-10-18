package com.iesemilidarder.base.controller;

import com.iesemilidarder.base.data.Car;
import com.iesemilidarder.base.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @RequestMapping("/car")
    public Vehicle getCar (@RequestParam(value="name", defaultValue="BrumBrum") String name) {
        Car car = new Car();
        car.setName(name);

        return car;
    }
}

