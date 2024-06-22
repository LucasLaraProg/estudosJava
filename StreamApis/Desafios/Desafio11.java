package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio11 {
//    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 21, 25, 30);
    Optional<Integer> soma =numeros.stream().map(n->n*n).reduce(Integer::sum);
    System.out.println(soma);
}
}
