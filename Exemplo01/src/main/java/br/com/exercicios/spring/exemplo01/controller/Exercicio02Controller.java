package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio02Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio02")
public class Exercicio02Controller {
    private final Exercicio02Service exercicio02Service;

    public Exercicio02Controller(Exercicio02Service exercicio02Service) {
        this.exercicio02Service = exercicio02Service;
    }

    @GetMapping("romano-para-decimal")
    public String romanoParaDecimal(@RequestParam String romano) {
        try {
            int decimal = exercicio02Service.converteRomanoEmDecimal(romano);
            return String.valueOf(decimal);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
