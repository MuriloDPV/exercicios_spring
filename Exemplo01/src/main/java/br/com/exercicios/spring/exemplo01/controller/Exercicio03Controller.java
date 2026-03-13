package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio03Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio03")
public class Exercicio03Controller {
    private final Exercicio03Service exercicio03Service;

    public Exercicio03Controller(Exercicio03Service exercicio03Service) {
        this.exercicio03Service = exercicio03Service;
    }

    @GetMapping("fatorial/{numero}")
    public String fatorial(@PathVariable int numero) {
        try {
            long resultado = exercicio03Service.fatorial(numero);
            return String.valueOf(resultado);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
