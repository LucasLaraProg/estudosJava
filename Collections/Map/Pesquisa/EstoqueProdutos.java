package edu.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoquesProdutosMap;

    public EstoqueProdutos() {
        this.estoquesProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod,String nome,int quantidade,double preco){
        estoquesProdutosMap.put(cod,new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoquesProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorEstoqueTotal=0;
        if (!estoquesProdutosMap.isEmpty()){
            for (Produto p:estoquesProdutosMap.values()){
                valorEstoqueTotal+=p.getPreco()*p.getQuantidade();
            }
        }
        else {
            throw new RuntimeException("Estoque de produtos vazio");
        }
        return valorEstoqueTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco=Double.MIN_VALUE;
        if (!estoquesProdutosMap.isEmpty()) {
            for (Produto p : estoquesProdutosMap.values()) {
                if (p.getPreco()>maiorPreco){
                    maiorPreco=p.getPreco();
                    produtoMaisCaro=p;
                }
            }
        }
        else {
            throw new RuntimeException("Estoque de produtos vazio");
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos=new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();
        estoqueProdutos.adicionarProduto(123,"maca",10,2.5);
        estoqueProdutos.adicionarProduto(124,"pera",5,5.0);
        estoqueProdutos.adicionarProduto(12,"uva",9,2.0);
        estoqueProdutos.adicionarProduto(1243,"morango",1,9.0);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }
}
