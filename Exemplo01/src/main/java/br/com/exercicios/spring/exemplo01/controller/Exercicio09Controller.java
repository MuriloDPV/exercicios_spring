package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio09Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio09")
public class Exercicio09Controller {
    private final Exercicio09Service exercicio09Service;

    public Exercicio09Controller(Exercicio09Service exercicio09Service) {
        this.exercicio09Service = exercicio09Service;
    }

    @GetMapping("area-triangulo")
    public String areaTriangulo(@RequestParam double base, @RequestParam double altura) {
        try {
            double area = exercicio09Service.areaTriangulo(base, altura);
            return String.valueOf(area);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
