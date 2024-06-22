package edu.BancoDigital;

public class ContaCorrente extends Conta{
    @Override
        public void imprimirExtrato() {
            System.out.println("------Extato Conta Corrente-------");
            imprimirInfos();
        }

    private static int SEQUENCIAL = 1092;
    public  ContaCorrente(Cliente cliente){
        super.agencia=Conta.AGENCIA_PADRAO;
        super.numero=SEQUENCIAL++;
        super.cliente=cliente;
    }
}
