package edu.Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        integerList.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
            for (Integer n : integerList) {
                soma += n;
            }
         return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero=Integer.MIN_VALUE;
        if(!integerList.isEmpty()){
            for (Integer n:integerList){
                if(n>=maiorNumero){
                    maiorNumero=n;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    @Override
    public String toString() {
        return integerList.toString();
    }

    public int encontrarMenorNumero(){
    int menorNumero=Integer.MAX_VALUE;
    if (!integerList.isEmpty()){
        for (Integer n:integerList){
            if (n<=menorNumero){
                menorNumero=n;
            }
        }
        return menorNumero;
    }
    else {
     throw new RuntimeException("A lista está vazia!!");
    }
    }
    public List<Integer> exibirNumeros(){
        if (!integerList.isEmpty()){
            List<Integer> listaInteirosExibir=new ArrayList<>(integerList);
            return listaInteirosExibir;
        }
        else {
            throw new RuntimeException("A Lista está vazia!!!");
        }


    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros=new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(22);
        somaNumeros.adicionarNumero(20);
        System.out.println("Soma dos números: "+somaNumeros.calcularSoma());
        System.out.println("O número maior da Lista: "+somaNumeros.encontrarMaiorNumero());
        System.out.println("O número menor da Lista: "+somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}
