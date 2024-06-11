package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosOrdenados= numeros.stream().sorted(Comparator.naturalOrder()).toList();
        numerosOrdenados.forEach(System.out::println);
    }
}
