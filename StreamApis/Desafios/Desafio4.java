package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
//    Desafio 4 - Remova todos os valores ímpares:
//    Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
public static void main(String[] args) {
    List<Integer> numeros= Arrays.asList(1,2,3,4,4,5,6,7,10);
    List<Integer> numeroPares = numeros.stream().filter(n->n%2==0).toList();
    numeroPares.forEach(System.out::println);
}
}
