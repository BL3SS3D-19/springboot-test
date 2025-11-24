package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

    //endpoint por defecto que devuelve un mensaje de inicio
    @GetMapping("/")
    public String inicio() {
        return "Bienvenido a mi primera aplicacion hecha en Spring Boot.";
    }

    //Desafio del endpoint + parametro
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola, " + nombre + " bienvenido a mi primera aplicacion hecha en Spring Boot.";
    }
}
