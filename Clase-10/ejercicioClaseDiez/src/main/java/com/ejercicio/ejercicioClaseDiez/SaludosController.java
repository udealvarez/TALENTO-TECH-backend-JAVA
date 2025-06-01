package com.ejercicio.ejercicioClaseDiez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludosController {

    @GetMapping("/hello")
    public String holaMundo(){
        return "Hola mundo!";
    }
}
