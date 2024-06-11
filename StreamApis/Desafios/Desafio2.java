package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio2 {
    //Desafio 2 - Imprima a soma dos números pares da lista:
    //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> soma = numeros.stream().filter(n->n%2==0).reduce(Integer::sum);
        System.out.println(soma);

    }
}
