package edu.Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeComprasList;

    public CarrinhoDeCompras() {
        this.carrinhoDeComprasList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeComprasList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover= new ArrayList<>();
        for (Item i: carrinhoDeComprasList){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
                System.out.println("Item removido:"+ i.getNome());
            }
        }
        carrinhoDeComprasList.removeAll(itensParaRemover);

    }
    public double calcularValorTotal(){
        double valorTotal=0d;
        for (Item i: carrinhoDeComprasList){
         double preco =i.getPreco();
         int qnt=i.getQuantidade();
         double valorItem=qnt*preco;
         valorTotal+=valorItem;

        }
        return valorTotal;
    }
    public void exibirItens(){
        for (Item i :carrinhoDeComprasList){
            System.out.println("Temos no Carrinho: "+i.getQuantidade()+" unidades de "+i.getNome()+" com o preço de R$"+i.getPreco());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras=new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("calca",1.79,10);
        carrinhoDeCompras.adicionarItem("camiseta",2.90,10);
        carrinhoDeCompras.adicionarItem("calca",1.79,10);
        carrinhoDeCompras.adicionarItem("Moleta Gucci",1009,2);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("calca");
        carrinhoDeCompras.exibirItens();
    }

}
