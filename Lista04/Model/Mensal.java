/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Mensal extends AluguelDeAutomovel {

    String PrecoPorDia;
    String PrecoPorHora;

    public Mensal(float preco, int prazo, float multa) {
        super(preco, prazo, multa);
    }
    
   
    public Mensal() {
        super();
    }

}
