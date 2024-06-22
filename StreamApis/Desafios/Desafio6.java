package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
//    Desafio 6 - Verificar se a lista contém algum número maior que 10:
//    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public static void main(String[] args) {
    List<Integer>numeros= Arrays.asList(1,2,3,4,5,6,11,2,3,10,99);
    numeros.stream().filter(n->n>10).forEach(System.out::println);
}
}
