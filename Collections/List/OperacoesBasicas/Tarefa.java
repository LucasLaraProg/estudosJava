package edu.Collections.List.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
}
