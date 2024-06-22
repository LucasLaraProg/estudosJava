package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio18 {
    //Desafio 18 - Verifique se todos os números da lista são iguais:
    //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,1,1,1,1,1);
        boolean sim= numeros.stream().allMatch(n-> n.equals(numeros.getFirst()));
        if (sim) System.out.println("todos números são iguais");
        else System.out.println("os números são diferentes");


    }
}
