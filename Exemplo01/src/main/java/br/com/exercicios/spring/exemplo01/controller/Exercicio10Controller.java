package br.com.exercicios.spring.exemplo01.controller;


import br.com.exercicios.spring.exemplo01.entity.Aluno;
import br.com.exercicios.spring.exemplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio10Controller")

public class Exercicio10Controller {
    @PostMapping("aluno")
    public String cadastrarAluno(@RequestBody Aluno aluno){
        return "Aluno " + aluno.getNome() + " cadastrado com sucesso na turma "
                + aluno.getTurma() + ".";
    }


}
