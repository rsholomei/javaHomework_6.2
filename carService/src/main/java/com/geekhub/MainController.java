package com.geekhub;

import com.geekhub.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    Car car;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return car.toString();
    }
}
