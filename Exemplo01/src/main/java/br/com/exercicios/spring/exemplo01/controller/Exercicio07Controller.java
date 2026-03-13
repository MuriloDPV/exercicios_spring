package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio07Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio07")
public class Exercicio07Controller {
    private final Exercicio07Service exercicio07Service;

    public Exercicio07Controller(Exercicio07Service exercicio07Service) {
        this.exercicio07Service = exercicio07Service;
    }

    @GetMapping("primo/{numero}")
    public String primo(@PathVariable int numero) {
        return String.valueOf(exercicio07Service.ehPrimo(numero));
    }
}
