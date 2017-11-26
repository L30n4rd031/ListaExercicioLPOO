/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;

/**
 *
 * @author leonardo
 */
public class ClienteController {
    
    private String nome;
    private float altura;
    private String sexo;
    
    public Cliente getObjetoCliente() {
        Cliente c = new Cliente();
        c.setAltura(this.altura);
        c.setNome(this.nome);
        c.setSexo(this.sexo);
        
        return c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
