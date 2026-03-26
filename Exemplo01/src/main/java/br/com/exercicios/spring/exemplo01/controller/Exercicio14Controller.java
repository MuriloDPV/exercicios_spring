package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Equipamento;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/exercicio14Controller")


public class Exercicio14Controller {

    @PostMapping("equipamento")
    public String cadastrarEquipamento(@RequestBody Equipamento equipamento){
        return "Equipamento " + equipamento.getNome() + " registrado com sucesso com numero "
                + equipamento.getNumero() + ".";
    }
    }





