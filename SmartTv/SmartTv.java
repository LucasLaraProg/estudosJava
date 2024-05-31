package edu.SmartTv;

public class SmartTv {
    private Boolean ligada=false;
    private int volume=25;
    private int canal=2;

    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void ligarTV(){
        setLigada(true);
    }
    public void desligarTV(){
        setLigada(false);
    }
    public void aumentarVolume(int volume){
        setVolume(volume+1);
    }
    public void diminuirVolume(int volume){
        setVolume(volume-1);
    }
    public void diminuirCanal(int canal){
        setCanal(canal-1);
    }
    public void aumentarCanal(int canal){
        setCanal(canal+1);
    }
    public void mudarCanal(int canal){
        setCanal(canal);
    }


}
