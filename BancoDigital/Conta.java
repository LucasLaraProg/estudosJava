package edu.BancoDigital;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements iConta{
    protected static int AGENCIA_PADRAO=1923;
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected List<Log>logs;

    private void gravarLog(int idconta,String operacao,double saldoAnterior,double saldoApos){
    Log log=new Log(idconta,operacao, saldoAnterior, saldoApos);
    System.out.println(log);
//    logs.add(log);
//    logs.stream().forEach(System.out::println);

    }

    public void imprimirLog(int idconta){
        if (cliente.getCpf()==idconta) {
            System.out.println("----------Log da Conta----------");
            //System.out.println("Date:" + logs.size());
//            System.out.println("Operação:" + log.getOperacao());
//            System.out.println("Saldo anterior:" + log.getSaldoAnterior());
//            System.out.println("Saldo após:" + log.getSaldoApos());
        }
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                ", cpf cliente="+cliente.getCpf()+
                '}';
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfos() {
        System.out.println("Cliente:"+this.cliente.getNome());
        System.out.println("Número da conta:"+this.numero);
        System.out.println("Agencia:"+this.agencia);
        System.out.printf("Saldo:"+this.saldo+"\n");
    }

    @Override
    public void sacar(double valor) {
        this.gravarLog(this.cliente.getCpf(),"Saque",saldo,saldo -= valor);
//        Log log=new Log(this.cliente.getCpf(),"saque", saldo, saldo -= valor);
//        logs.add(log);
//        logs.stream().forEach(System.out::println);
////        System.out.println("Log->");
////        System.out.println(log);

    }

    @Override
    public void depositar(double valor) {
        this.gravarLog(this.cliente.getCpf(),"Deposito",saldo,saldo+=valor);



    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        double saldoapos= saldo-valor;
        this.gravarLog(this.cliente.getCpf(),"Transferencia",saldo,saldoapos);
        this.sacar(valor);
        contaDestino.depositar(valor);



    }
}
