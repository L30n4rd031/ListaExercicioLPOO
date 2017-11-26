/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class CockerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String tipo = JOptionPane.showInputDialog("Tipo de Animal");
        String cor= JOptionPane.showInputDialog("Cor Animal");
        
        String nome = JOptionPane.showInputDialog("Nome do Animal");
        String raca = JOptionPane.showInputDialog("Raça do Animal");
        
        
        int tosaR = Integer.parseInt(JOptionPane.showInputDialog("Tosa 1 é True, Tosa 2 é False"));
        boolean tosa;
        
        tosa = tosaR == 1;      
                
                
        
        Cocker cocker1 = new Cocker(tipo, cor);        
        cocker1.setNome(nome);
        cocker1.setRaca(raca);
        cocker1.setTosa(tosa);
        
        
        JOptionPane.showMessageDialog(null, cocker1.toString() + " - " + cocker1.precisaTosa());
    }
    
}
