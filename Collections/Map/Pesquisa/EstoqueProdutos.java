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
    }
}
