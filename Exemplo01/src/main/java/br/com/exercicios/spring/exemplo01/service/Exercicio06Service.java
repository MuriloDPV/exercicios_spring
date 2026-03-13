package br.com.exercicios.spring.exemplo01.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Exercicio06Service {
    public double media(List<Double> notas) {
        if (notas == null || notas.isEmpty()) {
            throw new IllegalArgumentException("Parametro 'notas' vazio.");
        }
        double soma = 0.0;
        for (Double nota : notas) {
            if (nota == null) {
                throw new IllegalArgumentException("Nota invalida.");
            }
            soma += nota;
        }
        return soma / notas.size();
    }
}
