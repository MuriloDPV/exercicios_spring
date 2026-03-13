package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio09Service {
    public double areaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Base e altura devem ser nao-negativas.");
        }
        return (base * altura) / 2.0;
    }
}
