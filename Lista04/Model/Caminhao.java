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
public class Caminhao extends Automovel {

    String eixo;

    public Caminhao() {
        super();
    }

    public Caminhao(String marca, String modelo, String cor, String chassi, String eixo) {
        super(marca, modelo, cor, chassi);
        this.eixo = eixo;
    }

    public String getEixo() {
        return eixo;
    }

    public void setEixo(String eixo) {
        this.eixo = eixo;
    }
    

}
