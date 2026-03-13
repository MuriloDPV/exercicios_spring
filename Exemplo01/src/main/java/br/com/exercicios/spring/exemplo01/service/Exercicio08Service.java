package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio08Service {
    public double horasParaMinutos(double horas) {
        if (horas < 0) {
            throw new IllegalArgumentException("Parametro 'horas' deve ser nao-negativo.");
        }
        return horas * 60.0;
    }
}
