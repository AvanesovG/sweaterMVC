package com.avanes.sweater.contriller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {


    @GetMapping
    public String main(Map<String, Object> madel) {
        madel.put("some", "Все ок!");
        return "main";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World")
                                   String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }


}