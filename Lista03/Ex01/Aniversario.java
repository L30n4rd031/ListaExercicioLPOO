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
public class Aniversario extends CartaoWeb{
    
    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente){
        return "Querido (a) " + this.destinatario + ", Feliz Aniversário! Desejo que este dia contenha toda alegria que você merece.\n"
                + " Que não falte a paz, a saúde e o amor. Lute por tudo aquilo em que acredita e nunca desista de perseguir seus sonhos. " + remetente;
    }
    
}
