package edu.DioDesafioBootcamp;

import edu.DioDesafioBootcamp.Domain.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Neste curso iremos aprender sobre POO");
        curso.setCargaHoraria(10);
        Curso curso2 = new Curso();
        curso2.setTitulo("Php");
        curso2.setDescricao("Neste curso iremos aprender PHP e o framework mais utilizado Laravel");
        curso2.setCargaHoraria(30);
        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Essa mentoria de Java ");
        Set<Conteudo>conteudoSet=new HashSet<>();
        conteudoSet.add(curso);
        conteudoSet.add(mentoria);
        //System.out.println(conteudoSet);
        Bootcamp bootcamp = new Bootcamp("Bootcamp Dio Java Santander","Descrição",conteudoSet);
        bootcamp.getConteudos().add(curso2);
        Dev devLucas=new Dev("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Lucas antes");
        System.out.println("Conteúdos inscritos de "+devLucas.getNome()+":"+devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de "+devLucas.getNome()+": "+devLucas.getConteudosConcluidos());
        System.out.println("XP total "+ devLucas.calcularTotalXp());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Lucas depois de concluir:");
        System.out.println("Conteúdos inscritos de "+devLucas.getNome()+":"+devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de "+devLucas.getNome()+": "+devLucas.getConteudosConcluidos());
        System.out.println("XP total "+ devLucas.calcularTotalXp());

//        Dev devLeandro=new Dev("Leandro");
//        devLeandro.inscreverBootcamp(bootcamp);
//        System.out.println(devLeandro.getConteudosInscritos());
//        System.out.println(devLeandro.getConteudosConcluidos());
//
//        Dev devMarcio=new Dev("Marcio");
//        System.out.println(devMarcio.getConteudosInscritos());
//        System.out.println(devMarcio.getConteudosInscritos());


    }
}
