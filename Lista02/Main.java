/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

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
        
        Celular cel = new Celular();
        
        cel.setTipoContato("Telefonia");
        cel.setTipo("Celular");
        cel.setCor("Black");
        cel.setFormato("Retangular");
        cel.setFrequencia(1.6);
        cel.setTouchScreen(true);
        cel.setTocarMusica(true);
        cel.setTocaRadio(true);
        
        System.out.println(cel.caracteCelular());
        
    }
    
}
