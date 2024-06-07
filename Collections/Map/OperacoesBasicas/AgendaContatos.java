package edu.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome,Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            throw new RuntimeException("A agenda está vazia!");
        }
    }
    public void exibirContatos(){
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            throw new RuntimeException("A agenda está vazia!");
        }
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroDoNomePesquisado=null;
        if (!agendaContatoMap.isEmpty()) {
            numeroDoNomePesquisado= agendaContatoMap.get(nome);
            if (numeroDoNomePesquisado==null){
                throw new RuntimeException("O contato não foi encontrado!");
            }
        } else {
            throw new RuntimeException("A agenda está vazia!");
        }
        return numeroDoNomePesquisado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos=new AgendaContatos();
        agendaContatos.adicionarContato("Lucas",1234);
        agendaContatos.adicionarContato("Lucas Em",12345);
        agendaContatos.adicionarContato("Lucas Sch",123456);
        agendaContatos.adicionarContato("Lucas Joao",12345678);
        //agendaContatos.adicionarContato("Lucas",112312);//metodo put para adicionar, ele transcreve por cima do outro, sempre insere o ultimo que tem aquela determinada chave.
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Lucas Em"));
        System.out.println(agendaContatos.pesquisarPorNome("Lucas"));
        agendaContatos.removerContato("Lucas Joao");
        agendaContatos.exibirContatos();
    }
}
