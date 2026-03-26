package br.com.exercicios.spring.exemplo01.entity;

public class Aluno {

    private String nome;
    private int idade;
    private String turma;


    public Aluno() {
    }

    public Aluno(String turma, String nome, int idade) {
        this.turma = turma;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
