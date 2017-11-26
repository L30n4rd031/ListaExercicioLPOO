/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

/**
 *
 * @author leonardo
 */
public class Celular extends DispositvoTelefonia {
    
    private double frequencia;
    private boolean touchScreen;
    private boolean tocarMusica;
    private boolean tocaRadio;

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isTocarMusica() {
        return tocarMusica;
    }

    public void setTocarMusica(boolean tocarMusica) {
        this.tocarMusica = tocarMusica;
    }

    public boolean isTocaRadio() {
        return tocaRadio;
    }

    public void setTocaRadio(boolean tocaRadio) {
        this.tocaRadio = tocaRadio;
    }
    
    public String caracteCelular(){
        return "Caracteristicas do Celular \n"
                + "Tipo de Comunição: " + this.getTipoContato() + "\n"
                + "Tipo de Dispositivo: " + this.getTipo() + "\n"
                + "Cor: " + this.getCor() + "\n"
                + "Formato: " +  this.getFormato() + "\n"
                + "Frequência: " + this.frequencia + "\n"
                + "Tela Touch Screeen: " + (this.touchScreen == true ? "SIM" : "NÃO") + "\n"
                + "Tocar Música: " + (this.tocarMusica == true ? "SIM" : "NÃO") + "\n"
                + "Tocar Rádio: " + (this.tocaRadio == true ? "SIM" : "NÃO");
    }
            
    
}