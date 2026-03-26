package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Evento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio12Controller")

public class Exercicio12Controller {
    @PostMapping("evento")
    public String cadastrarEvento(@RequestBody Evento evento){
        return "Evento " + evento.getNome() + " cadastrado com sucesso para a data "
                + evento.getData() + " no local " + evento.getLocal() + ".";
    }
}


