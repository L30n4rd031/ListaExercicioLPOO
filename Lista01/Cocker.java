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
public class Cocker extends Cacharro{
    
    private boolean tosa;

    public Cocker(String tipo, String cor) {
        super(tipo, cor);
    }

    public void setTosa(boolean tosa){
        this.tosa = tosa;
    }
    
    public String precisaTosa(){
        
        String m;
        
        if(this.tosa){
            m = "Precisa Tosa";
        }else {
            m = "Não Precisa Tosa";
        }
        return m;
    }
}
