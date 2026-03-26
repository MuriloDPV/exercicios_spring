package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Prova;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio11Controller")

public class Exercicio11Controller {
    @PostMapping("aluno")
    public String cadastrarProva(@RequestBody Prova prova){
        return "Prova de " + prova.getMateria() + " registrada para " + prova.getNome()
                + " com nota " + prova.getNota() + ".";
    }
}

