package edu.Collections.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome,long matricula,double media){
        alunosSet.add(new Alunos(nome,matricula,media));
    }
    public void removerAluno(long matricula){
        Alunos alunoParaRemover=null;
        for (Alunos a:alunosSet){
            if (a.getMatricula()==matricula){
                alunoParaRemover=a;
                alunosSet.remove(alunoParaRemover);
                break;
            }
        }

    }
    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome=new TreeSet<>(alunosSet);
        return alunosPorNome;
    }
    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota=new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }
    public void exibitAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos=new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Lucas",12332,4.9);
        gerenciadorAlunos.adicionarAluno("Jõao",1233,7.9);
        gerenciadorAlunos.adicionarAluno("Marcos",12332,8.9);
        gerenciadorAlunos.adicionarAluno("Lindomar",1231,9.9);
       // gerenciadorAlunos.exibitAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(1233);
        gerenciadorAlunos.exibitAlunos();
    }

}
