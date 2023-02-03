package com.devops.proyecto.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraController
{
    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"todoOk\" : true }";
    }

    @GetMapping("/suma/{a},{b}")
    public String getSuma(@PathVariable("a") double num1, @PathVariable("b") double num2 )
    {
        double suma = num1 + num2;
        return ("La Suma de dos numeros es:"+suma);
    }
    @GetMapping("/resta/{a},{b}")
    public String getResta(@PathVariable("a") int num1, @PathVariable("b") int num2 )
    {
        int resta = num1 - num2;
        return ("La Resta de dos numeros es:"+resta);
    }
    @GetMapping("/multi/{a},{b}")
    public String getMultiplicacion(@PathVariable("a") int num1, @PathVariable("b") int num2 )
    {
        int multi = num1 * num2;
        return ("La mutiplicacion de dos numeros es:"+multi);
    }
    @GetMapping("/division/{a},{b}")
    public String getMultiplicacion(@PathVariable("a") double num1, @PathVariable("b") double num2 )
    {
        double div = num1 / num2;
        return ("La division de dos numeros es:"+div);
    }
}


