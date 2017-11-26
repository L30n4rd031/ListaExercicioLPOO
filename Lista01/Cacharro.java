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
public class Cacharro extends Animal{
    
    private String nome;
    private String raca;

    public Cacharro(String tipo, String cor) {
        super(tipo, cor);
    }
    
    @Override    
    public String toString(){
        return "Nome: " + this.nome + " - " + "Raça: " + this.raca;
    }    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    
    
}
