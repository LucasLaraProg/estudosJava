package edu.Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover=null;
        for (Convidado c:convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover=c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return  convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados =new ConjuntoConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.adicionarConvidado("Bruna",1234);
        conjuntoConvidados.adicionarConvidado("Rose",123);
        conjuntoConvidados.adicionarConvidado("Maria",123);
        conjuntoConvidados.adicionarConvidado("Joana",12345);
        conjuntoConvidados.adicionarConvidado("Fernanda",125234);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
