package edu.Collections.Set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean feita;

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", feita=" + feita +
                '}';
    }
}
