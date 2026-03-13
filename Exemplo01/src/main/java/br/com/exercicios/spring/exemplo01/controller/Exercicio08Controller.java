package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio08Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("api/exercicio08")
public class Exercicio08Controller {
    private final Exercicio08Service exercicio08Service;

    public Exercicio08Controller(Exercicio08Service exercicio08Service) {
        this.exercicio08Service = exercicio08Service;
    }

    @GetMapping("horas-para-minutos")
    public String horasParaMinutos(@RequestParam double horas) {
        try {
            double minutos = exercicio08Service.horasParaMinutos(horas);
            return String.valueOf(minutos);
        } catch (IllegalArgumentException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
        }
    }
}
