package edu.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra,Integer contagem){
        contagemPalavrasMap.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
        else throw new RuntimeException("Lista de contagem vazia!");
    }
    public void exibirContagemPalavras(){
        if (!contagemPalavrasMap.isEmpty()){
            System.out.println(contagemPalavrasMap);
        }
        else throw new RuntimeException("Lista de contagem vazia!");

    }
    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente=null;
        int maisFrequente=Integer.MIN_VALUE;
        if (!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String,Integer> entry :contagemPalavrasMap.entrySet()){
                if (entry.getValue()>maisFrequente){
                    maisFrequente=entry.getValue();
                    linguagemMaisFrequente=entry.getKey();
                }
            }
            return linguagemMaisFrequente;
        }
        else throw new RuntimeException("Lista de contagem vazia!");
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras=new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Junho",3);
        contagemPalavras.adicionarPalavra("Julho",1);
        contagemPalavras.adicionarPalavra("fevereiro",1000);
        contagemPalavras.adicionarPalavra("abril",110);
        contagemPalavras.adicionarPalavra("maio",30);
        contagemPalavras.adicionarPalavra("novembro",13);
        contagemPalavras.adicionarPalavra("dezembro",15);
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("Julho");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }

}
