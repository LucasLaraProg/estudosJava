package edu.Construtor;

public class Aluno {
    private String nome;
    private int ra;
    private String materia;
    private double nota;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Aluno() {
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
