package com.axl.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        System.out.println("Hola mundo desde Spring Boot (Consola)");
        return "¡Hola mundo desde Spring Boot en la Web!";
    }
}