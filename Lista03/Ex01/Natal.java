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
public class Natal extends CartaoWeb{
    
    public Natal(String destinatario){
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente){
        return "Querido (a) " + this.destinatario + ", Desejo que o seu Natal seja brilhante de alegria, iluminado de amor, "
                + "cheio de harmonia e completo de paz. Feliz Natal!!\n"
                + " " + remetente;
    }
    
}
