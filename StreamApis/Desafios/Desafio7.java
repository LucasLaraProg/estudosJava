package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
//    Desafio 7 - Encontrar o segundo número maior da lista:
//    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer> numeros= Arrays.asList(1,2,3,4,5,6,7,10,11,12,20,30);
    Optional<Integer> segundoMaior=numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    System.out.println(segundoMaior);
}
}
