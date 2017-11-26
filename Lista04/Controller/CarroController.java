/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carro;

/**
 *
 * @author leonardo
 */
public class CarroController {
    
    private String Categoria;
    
    private String marca;
    private String modelo;
    private String cor;
    private String chassi;
    
    public Carro getObjetoCarro() {
        
        Carro c = new Carro();
        c.setChassi(this.chassi);
        c.setCor(this.cor);
        c.setMarca(this.marca);
        c.setModelo(this.modelo);
        
        return c;        
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
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
