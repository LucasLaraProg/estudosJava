package edu.Collections.Map.Ordenacao;

import javax.swing.text.LabelView;
import java.util.*;

public class LivrariaOnline {
    Map<String,Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }
    public void adicionarLivro(String link,String titulo,String autor,double preco){
        livroMap.put(link,new Livro(titulo, autor, preco));
    }
    public void removerLivro(String titulo){
        String keyRemover;
        boolean achou=false;
        if (!livroMap.isEmpty()){
            for (Map.Entry<String,Livro>entry:livroMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    keyRemover = entry.getKey();
                    livroMap.remove(keyRemover);
                    achou=true;
                    break;
                }
            }
            if (!achou)throw new RuntimeException("Livro não encontrado");

        }
        else throw new RuntimeException("Livraria vazia");
    }
    public void exibirLivros(){
        if (!livroMap.isEmpty()){
            System.out.println(livroMap);
        }
        else throw new RuntimeException("Livraria vazia");
    }
    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        if (!livroMap.isEmpty()){
            List<Map.Entry<String,Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livroMap.entrySet());
            Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
            Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
            for (Map.Entry<String,Livro> entry:livrosParaOrdenarPorPreco){
                livrosOrdenadosPorPreco.put(entry.getKey(),entry.getValue());
            }
            return livrosOrdenadosPorPreco;
        }

        else throw new RuntimeException("Livraria vazia");
    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor){
        if (!livroMap.isEmpty()){
            List<Map.Entry<String,Livro>>livrosParaOrdenarPorAutor = new ArrayList<>(livroMap.entrySet());
            Collections.sort(livrosParaOrdenarPorAutor,new ComparatorPorAutor());
            Map<String, Livro> livosOrdenadosPorAutor= new LinkedHashMap<>();
            for (Map.Entry<String,Livro>entry:livrosParaOrdenarPorAutor){
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }
            return livosOrdenadosPorAutor;
        }
        else throw new RuntimeException("Livraria vazia");
    }
    public List<Livro> obterLivroMaisCaro(){
        double valorMaisCaro=Double.MIN_VALUE;
        List<Livro> livrosMaisCaros=new ArrayList<>();
        if (!livroMap.isEmpty()){
            for (Livro livro:livroMap.values()){
                if (livro.getPreco()>valorMaisCaro){
                    valorMaisCaro=livro.getPreco();
                }
            }
        }
        else throw new RuntimeException("Livraria vazia");
        for (Map.Entry<String,Livro> entry:livroMap.entrySet()){
            if (entry.getValue().getPreco()==valorMaisCaro){
                Livro livroComPrecoMaisCaro=livroMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisCaro);
            }
        }
        return livrosMaisCaros;
    }
    public List<Livro> obterLivroMaisBarato(){
        double valorMaisBarato=Double.MAX_VALUE;
        List<Livro> livrosMaisBaratos=new ArrayList<>();
        if (!livroMap.isEmpty()){
            for (Livro livro:livroMap.values()){
                if (livro.getPreco()<valorMaisBarato){
                    valorMaisBarato=livro.getPreco();
                }
            }
        }
        else throw new RuntimeException("Livraria vazia");
        for (Map.Entry<String,Livro> entry:livroMap.entrySet()){
            if (entry.getValue().getPreco()==valorMaisBarato){
                Livro livroComPrecoMaisBarato=livroMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBarato);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline=new LivrariaOnline();
        livrariaOnline.adicionarLivro("www.livro.com","habla","lucas",5.2);
        livrariaOnline.adicionarLivro("www.livros.com","hablasas","lucas",1.4);
        livrariaOnline.adicionarLivro("www.livrosasdasd.com","hablasas","joao",10.4);
        //livrariaOnline.exibirLivros();
        //livrariaOnline.removerLivro("habla");
        //livrariaOnline.exibirLivros();
       // System.out.println(livrariaOnline.pesquisarLivrosPorAutor("lucas"));
        //System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.obterLivroMaisBarato());
    }
}
