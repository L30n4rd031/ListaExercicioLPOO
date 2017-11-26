/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 *
 * @author leonardo
 */
public abstract class CartaoWeb {
    
    public String destinatario;
    
    
    public String retornarMensagem(String remetente){
        return this.destinatario;
    }
    
}
