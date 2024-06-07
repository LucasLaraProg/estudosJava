package edu.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adcionarPalavra(String palavra,String definicao){
        dicionarioMap.put(palavra,definicao);
    }
    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
        else {
            throw new RuntimeException("Dicionario de palavras está vazio!");
        }
    }
    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        else throw new RuntimeException("Palavra não encontrada");
    }
    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }
        else {
            throw new RuntimeException("Dicionario de palavras está vazio!");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario=new Dicionario();
        dicionario.adcionarPalavra("Felicidade","a felicidade é subjetiva");
        dicionario.adcionarPalavra("Amor","o amor é subjetivo");
        dicionario.adcionarPalavra("Dinheiro","o dinheiro é um objeto utilizado como barganha");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Dinheiro"));
        dicionario.removerPalavra("Amor");
        dicionario.exibirPalavras();
    }
}
