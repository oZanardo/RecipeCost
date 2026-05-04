package com.spring.recipecost.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/")
    public String boasVindas(){
        return "Boas Vindas ao meu 'primeiro' projeto String, estamos em construção";
    }


}
