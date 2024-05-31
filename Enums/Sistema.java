package edu.Enums;

public class Sistema {
    public static void main(String[] args) {
        /*for(EstadoBrasileiro e: EstadoBrasileiro.values() ){
            System.out.println(e.getNome()+" "+e.getSigla());
        }*/
        EstadoBrasileiro eRj= EstadoBrasileiro.RIO_JANEIRO;
        System.out.println(eRj.getNome());
        System.out.println(eRj.getSigla());

    }
}
