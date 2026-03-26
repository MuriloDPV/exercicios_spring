package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicio13Controller")
public class Exercicio13Controller {

    @PostMapping("mensagem")
    public String enviarMensagem(@RequestBody Mensagem mensagem) {
        return "Mensagem enviada com sucesso de " + mensagem.getRemetente() +
                " para " + mensagem.getDestinatario() + ".";
    }
}
