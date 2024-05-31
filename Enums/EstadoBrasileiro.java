package edu.Enums;

public enum EstadoBrasileiro {
    PARANA ("PR","Paraná"),
    RIO_JANEIRO("RJ","Rio de Janeiro");
    private String nome;
    private String sigla;
    private EstadoBrasileiro(String sigla,String nome){
        this.sigla=sigla;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
