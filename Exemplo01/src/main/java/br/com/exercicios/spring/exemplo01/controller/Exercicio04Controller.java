package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio04Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio04")
public class Exercicio04Controller {
    private final Exercicio04Service exercicio04Service;

    public Exercicio04Controller(Exercicio04Service exercicio04Service) {
        this.exercicio04Service = exercicio04Service;
    }

    @GetMapping("palindromo")
    public String palindromo(@RequestParam String palavra) {
        try {
            return String.valueOf(exercicio04Service.ehPalindromo(palavra));
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
