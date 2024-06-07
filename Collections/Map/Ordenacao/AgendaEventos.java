package edu.Collections.Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap =new HashMap<>();
    }
    public void adicionarEvento(LocalDate data,String nome,String atracao){
        Eventos eventos=new Eventos(nome,atracao);
        eventosMap.put(data,eventos);
    }
    public void exibirAgenda(){
        Map<LocalDate,Eventos> eventosTreeMap= new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual=LocalDate.now();
        LocalDate proximaData=null;
        Eventos proximoEvento=null;
        boolean eventoTem=false;
        Map<LocalDate,Eventos> eventosTreeMap =new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate,Eventos> entry:eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData= entry.getKey();
                proximoEvento=entry.getValue();
                System.out.println("O proximo evento: "+proximoEvento+" irá acontecer na data: "+ proximaData);
                eventoTem=true;
                break;
            }
        }
        if (!eventoTem){

                throw new RuntimeException("Nenhum Evento proximo!");

        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos=new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2020,3,1),"Show Principal","Bruno e Marrone");
        agendaEventos.adicionarEvento(LocalDate.of(2024,6,15),"Show do Doca","Sidoka");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
