package edu.BancoDigital;

import java.util.List;

public class BancoDigital {
    public BancoDigital(String nome) {
        this.nome = nome;
    }

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return "BancoDigital{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
