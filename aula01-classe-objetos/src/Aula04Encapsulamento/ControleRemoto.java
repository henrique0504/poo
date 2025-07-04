package Aula04Encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }

    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }

    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&& this.getVolume()>0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()&& this.getVolume()==0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado()&& !(this.getTocando())){
            this.setTocando(false);

    }
}