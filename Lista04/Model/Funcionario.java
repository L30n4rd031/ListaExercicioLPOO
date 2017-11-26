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
public class Funcionario extends Pessoa {
        String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Funcionario(String nome, float altura, String sexo) {
        super(nome, altura, sexo);
    }
    
    public Funcionario(){
        super();
    }
}
       
        
