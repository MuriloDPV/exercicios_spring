package br.com.exercicios.spring.exemplo01.entity;

public class Prova {
    private String materia;
    private double nota;
    private String nome;


    public Prova() {
    }

    public Prova(String materia, double nota, String nome) {
        this.materia = materia;
        this.nota = nota;
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
