package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio03Service {
    public long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Numero deve ser nao-negativo.");
        }
        long resultado = 1L;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
