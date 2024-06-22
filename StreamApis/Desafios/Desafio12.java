package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio12 {
    //Desafio 12 - Encontre o produto de todos os números da lista:
    //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> produto =numeros.stream().reduce((n1, n2)->n1*n2);
        System.out.println(produto);
    }
}
