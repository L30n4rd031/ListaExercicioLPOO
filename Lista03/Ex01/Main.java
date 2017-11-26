/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CartaoWeb[] cW = new CartaoWeb[3];

        cW[0] = new DiaDosNamorados("Maria");
        cW[1] = new Natal("Pedro");
        cW[2] = new Aniversario("Francisco");

        for (int i = 0; i < 3; i++) {
            String remetente = "";
            do {
                remetente = JOptionPane.showInputDialog((i == 0 ? "Dia dos Namorados de" : i == 1 ? "Feliz Natal de - " : "Feliz Aniversário de - ") + " Remetente: ");
            } while (remetente.equals(""));

            JOptionPane.showMessageDialog(null, cW[i].retornarMensagem(remetente));

        }
    }

}
