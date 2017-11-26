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
public class Diaria extends AluguelDeAutomovel {
        String data;
        String hora;
        public Diaria(float preco, int prazo, float multa) {
            super(preco, prazo, multa);
   
        }
        
        public Diaria(){
            super();
        }
        
    }
