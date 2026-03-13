package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio05Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio05")
public class Exercicio05Controller {
    private final Exercicio05Service exercicio05Service;

    public Exercicio05Controller(Exercicio05Service exercicio05Service) {
        this.exercicio05Service = exercicio05Service;
    }

    @GetMapping("celsius-para-fahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double celsius) {
        double fahrenheit = exercicio05Service.celsiusParaFahrenheit(celsius);
        return String.valueOf(fahrenheit);
    }
}
