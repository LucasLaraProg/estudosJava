package edu.SmartTv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SmartTv smartTv=new SmartTv();
        System.out.println("TV LIGADA? "+ smartTv.getLigada());
        System.out.println("Volume TV: "+ smartTv.getVolume());
        System.out.println("Canal TV: "+ smartTv.getCanal());
        smartTv.setVolume(2);
        smartTv.setCanal(3);
        smartTv.setLigada(true);
        System.out.println("TV LIGADA? "+ smartTv.getLigada());
        System.out.println("Volume TV: "+ smartTv.getVolume());
        System.out.println("Canal TV: "+ smartTv.getCanal());
        smartTv.desligarTV();
        System.out.println("TV LIGADA? "+ smartTv.getLigada());
        smartTv.aumentarVolume(smartTv.getVolume());
        System.out.println("Volume TV: "+ smartTv.getVolume());
        smartTv.diminuirVolume(smartTv.getVolume());
        smartTv.aumentarCanal(smartTv.getCanal());
        smartTv.diminuirCanal(smartTv.getCanal());
        System.out.println("Digite para qual canal deseja mudar:");
        int canal = scanner.nextInt();
        smartTv.mudarCanal(canal);
        System.out.println("Canal TV: "+ smartTv.getCanal());




    }
}
