package edu.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    private Integer numeroConta;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ContaTerminal contaTerminal= new ContaTerminal();
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta=scanner.nextInt();
        contaTerminal.setNumeroConta(numeroConta);
        System.out.println("Por favor, digite o nome do Cliente !");
        String nome=scanner.next();
        contaTerminal.setNomeCliente(nome);
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia=scanner.next();
        contaTerminal.setAgencia(numeroAgencia);
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldoConta=scanner.nextDouble();
        contaTerminal.setSaldo(saldoConta);

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque." );

    }
}
