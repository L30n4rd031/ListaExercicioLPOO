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
public class DiaDosNamorados extends CartaoWeb{
    
    
    public DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente){
        return "Querido (a) " + this.destinatario + ",Feliz Dia dos Namorados!\n"
                + " Espero que essa tenha sido o único cartão do dia dos namorados que esse tenha ganhado nessa data! De todo meu coração,\n"
                + " " + remetente;
    }
}
