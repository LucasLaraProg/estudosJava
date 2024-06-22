package edu.StreamApis.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    // - Verifique se a lista contém pelo menos um número negativo:
    //Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean negativoSim= numeros.stream().anyMatch(n->n<0);
        if (negativoSim) System.out.println("Existe número negativo na lista");
        else System.out.println("Não existe número negativo na lista");
    }
}
