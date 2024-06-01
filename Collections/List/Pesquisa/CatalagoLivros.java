package edu.Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo,String autor,int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public  List<Livro> pesquisarPorAutor(String autor){
        List<Livro>livrosPorAutor=new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l:livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public  List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos=new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l :livroList){
                if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo=null;
        if (!livroList.isEmpty()){
            for (Livro l :livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo=l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros=new CatalagoLivros();
        catalagoLivros.adicionarLivro("Harry Jhonson","Jhonson Baby",2010);
        catalagoLivros.adicionarLivro("Harry Jhonson","bab",1999);
        catalagoLivros.adicionarLivro("Hablla","bab",2001);
        catalagoLivros.adicionarLivro("Livrosa san","Jhcay",1960);
        catalagoLivros.adicionarLivro("Baby son","Jhony Cage",2000);
        System.out.println(catalagoLivros.pesquisarPorAutor("bab"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2000,2010));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Harry Jhonson"));
    }
}
