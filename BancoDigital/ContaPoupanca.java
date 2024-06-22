package edu.BancoDigital;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("------Extato Conta Poupança-------");
        imprimirInfos();
    }

    private static int SEQUENCIAL =1;

    public ContaPoupanca(Cliente cliente) {
        super.agencia=Conta.AGENCIA_PADRAO;
        super.numero=SEQUENCIAL++;
        super.cliente=cliente;
    }
}

