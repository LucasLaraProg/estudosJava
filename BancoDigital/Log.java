package edu.BancoDigital;

import java.util.Date;

public class Log {
    private int idconta;
    private Date dateLog = new Date();
    private String operacao;
    private double saldoAnterior;
    private double saldoApos;

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getSaldoApos() {
        return saldoApos;
    }

    public void setSaldoApos(double saldoApos) {
        this.saldoApos = saldoApos;
    }

    @Override
    public String toString() {
        return "Log{" +
                "idconta=" + idconta +
                ", dateLog=" + dateLog +
                ", operacao='" + operacao + '\'' +
                ", saldoAnterior=" + saldoAnterior +
                ", saldoApos=" + saldoApos +
                '}';
    }

    public Log(int idconta, String operacao, double saldoAnterior, double saldoApos) {
        this.idconta = idconta;
        this.operacao = operacao;
        this.saldoAnterior = saldoAnterior;
        this.saldoApos = saldoApos;
    }

    public Date getDateLog() {
        return dateLog;
    }

    public void setDateLog(Date dateLog) {
        this.dateLog = dateLog;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
