package edu.Construtor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        String nome="bruno";
        int ra=123;
        Aluno aluno2= new Aluno(nome,ra);
        System.out.println("Aluno 2" +
                "\nNome:"+aluno2.getNome()+
                "\nRa:"+aluno2.getRa());
        String nomealuno=aluno2.getNome();
        System.out.println("Digite a materia do "+nomealuno);
        aluno2.setMateria(scanner.next());
        aluno2.setNome("João");
        System.out.println("A matéria de "+aluno2.getNome()+"  é:"+aluno2.getMateria());
    }
}
