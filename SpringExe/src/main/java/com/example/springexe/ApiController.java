package com.example.springexe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/home")
    public String homeResponse(){
        return "Morning";
    }

}
