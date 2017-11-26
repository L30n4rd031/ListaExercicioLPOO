/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Automovel;
import Model.GerarAluguel;
import Model.Pessoa;

/**
 *
 * @author leonardo
 */
public class GerarAluguelController {
    
    private Pessoa cliete;
    private Automovel auto;
    private int tipo;
    
    private String retornoMsg;
    
    public void gerarAluguel() {
        GerarAluguel gAluguel = new GerarAluguel(this.cliete, this.auto, this.tipo);
        
        this.retornoMsg = "Olá " + gAluguel.gerar().getPessoa().getNome() + " o aluguel do automovel de marca "+gAluguel.gerar().getAutomovel().getMarca()+" e modelo "+gAluguel.gerar().getAutomovel().getModelo()+" é R$ " + gAluguel.gerar().getAluguel();
        
    }
    
    public String getRetornoMsg() {
        return this.retornoMsg;
    }

    public Pessoa getCliete() {
        return cliete;
    }

    public void setCliete(Pessoa cliete) {
        this.cliete = cliete;
    }

    public Automovel getAuto() {
        return auto;
    }

    public void setAuto(Automovel auto) {
        this.auto = auto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
