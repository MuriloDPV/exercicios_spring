package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio06Service;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio06")
public class Exercicio06Controller {
    private final Exercicio06Service exercicio06Service;

    public Exercicio06Controller(Exercicio06Service exercicio06Service) {
        this.exercicio06Service = exercicio06Service;
    }

    @GetMapping("media-notas")
    public String mediaNotas(@RequestParam List<Double> notas) {
        try {
            double media = exercicio06Service.media(notas);
            return String.valueOf(media);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
