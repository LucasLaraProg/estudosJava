package edu.Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList =new ArrayList<>();
    }
    public void adicionarPessoa(String nome,int idade,double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessosPorIdade=new ArrayList<>(pessoaList);
        Collections.sort(pessosPorIdade);
        return pessosPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura=new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return  pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas=new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Lucas",20,1.60);
        ordenacaoPessoas.adicionarPessoa("Emanuel",19,1.88);
        ordenacaoPessoas.adicionarPessoa("Lucio",15,1.90);
        ordenacaoPessoas.adicionarPessoa("Luana",12,1.50);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

