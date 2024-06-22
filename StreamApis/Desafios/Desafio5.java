package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Desafio5 {
//    Desafio 5 - Calcule a média dos números maiores que 5:
//    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer> numeros= Arrays.asList(1,2,3,4,5,10,10,11);
    double media=numeros.stream().filter(n->n>5).mapToInt(Integer::intValue).average().getAsDouble();
    System.out.printf("%.2f",media);
}
}
