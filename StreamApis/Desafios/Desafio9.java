package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
//    Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//    Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer> numeros= Arrays.asList(1,1,2,2,3,4,4,5,5);
    numeros.stream().distinct().forEach(System.out::println);
}
}
