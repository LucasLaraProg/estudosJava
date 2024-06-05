package edu.Collections.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void addProduct(int cod,String name,double price,int amount){
        produtoSet.add(new Produto(cod,name,price,amount));
    }
    public Set<Produto> showProdductsForName(){
        Set<Produto> productsForName = new TreeSet<>(produtoSet);
        return productsForName;
    }

    public Set<Produto> showProductsForPrice(){
        Set<Produto> productsForPrice =new TreeSet<>(new ComparatorForPrice());
        productsForPrice.addAll(produtoSet);
        return productsForPrice;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos =new CadastroProdutos();
        cadastroProdutos.addProduct(1,"Banana",2.5,10);
        cadastroProdutos.addProduct(2,"Apple",3,10);
        cadastroProdutos.addProduct(3,"Strawberry",1,10);
        System.out.println(cadastroProdutos.showProdductsForName());
        System.out.println(cadastroProdutos.showProductsForPrice());
    }
}
