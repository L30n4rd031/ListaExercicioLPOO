/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Caminhao;

/**
 *
 * @author leonardo
 */
public class CaminhaoController {
    
    private String eixo;
    
    private String marca;
    private String modelo;
    private String cor;
    private String chassi;
    
    public Caminhao getObjetoCaminhao() {
        
        Caminhao c = new Caminhao();
        c.setEixo(this.eixo);
        c.setChassi(this.chassi);
        c.setCor(this.cor);
        c.setMarca(this.marca);
        c.setModelo(this.modelo);
        
        return c;        
    }

    public String getEixo() {
        return eixo;
    }

    public void setEixo(String eixo) {
        this.eixo = eixo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    
    
}
