package br.com.exercicios.spring.exemplo01.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Exercicio02Service {
    private static final Map<Character, Integer> ROMAN_VALUES = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int converteRomanoEmDecimal(String romano) {
        if (romano == null || romano.trim().isEmpty()) {
            throw new IllegalArgumentException("Parametro 'romano' vazio.");
        }

        String valor = romano.trim().toUpperCase();
        int total = 0;
        int anterior = 0;

        for (int i = valor.length() - 1; i >= 0; i--) {
            char c = valor.charAt(i);
            Integer atual = ROMAN_VALUES.get(c);
            if (atual == null) {
                throw new IllegalArgumentException("Caractere romano invalido: " + c);
            }

            if (atual < anterior) {
                total -= atual;
            } else {
                total += atual;
                anterior = atual;
            }
        }

        return total;
    }
}
