package edu.BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente lucas =new Cliente("Lucas",1123451234);
        Cliente maria =new Cliente("Maria",1123);

        Conta contaCc= new ContaCorrente(lucas);
        Conta contaPp=new ContaPoupanca(maria);
        BancoDigital bancoBB=new BancoDigital("Banco do Brasil");
        List<Conta> contas=new ArrayList<>();
        contas.add(contaPp);
        contas.add(contaCc);
        bancoBB.setContas(contas);
        System.out.println(bancoBB);
        contaCc.depositar(400);
        contaCc.transferir(400,contaPp);
        contaPp.imprimirExtrato();
        contaCc.imprimirExtrato();
        //contaCc.imprimirLog();

    }

}
