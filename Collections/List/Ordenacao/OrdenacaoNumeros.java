package edu.Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosOrderBy;

    public OrdenacaoNumeros() {
        this.numerosOrderBy = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosOrderBy.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(numerosOrderBy);
        if (!numerosOrderBy.isEmpty()){
            Collections.sort(listaAscendente);
            return listaAscendente;
        }
        else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return numerosOrderBy.toString();
    }

    public List<Integer> ordenarDescendente(){
        List<Integer>listaDescendente= new ArrayList<>(numerosOrderBy);
        if (!numerosOrderBy.isEmpty()){
            listaDescendente.sort(Collections.reverseOrder());
            return listaDescendente;
        }
        else {
            throw new RuntimeException("A lista está vazia!!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(1);
        System.out.println("Lista como está: "+ordenacaoNumeros.numerosOrderBy);
        System.out.println("Lista em ordem Crescente: "+ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista em ordem Decrescente: "+ordenacaoNumeros.ordenarDescendente());

    }

}
