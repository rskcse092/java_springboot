package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

        @RestController
        @RequestMapping("/api")

public class WelcomeController {

            //localhost:8080/api/welcome
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to spring boot";
    }
}
