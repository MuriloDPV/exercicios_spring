package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio04Service {
    public boolean ehPalindromo(String palavra) {
        if (palavra == null || palavra.trim().isEmpty()) {
            throw new IllegalArgumentException("Parametro 'palavra' vazio.");
        }
        String valor = palavra.trim().toLowerCase();
        String reverso = new StringBuilder(valor).reverse().toString();
        return valor.equals(reverso);
    }
}
