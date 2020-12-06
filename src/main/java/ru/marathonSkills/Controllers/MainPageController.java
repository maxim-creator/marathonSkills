package ru.marathonSkills.Controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping
    public String getMainPage(){
        return "mainPage";
    }

    @GetMapping("/runner")
    public String runner(){
        return "runner/runner";
    }


}
