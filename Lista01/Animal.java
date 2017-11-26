/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author leonardo
 */
public class Animal {
    
    private String tipo;
    private String cor;
    
    
    public Animal(String tipo, String cor){
        
        this.tipo = tipo;
        this.cor = cor;
    }
    
    @Override    
    public String toString(){
        return "Cor: " + this.cor + " - " + "Tipo: " + this.tipo;
    }
    
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    
    
}
