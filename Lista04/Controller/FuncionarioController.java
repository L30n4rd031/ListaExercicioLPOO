/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionario;

/**
 *
 * @author leonardo
 */
public class FuncionarioController {
    
    private String nome;
    private float altura;
    private String sexo;
    
    public Funcionario getObjetoCliente() {
        Funcionario f = new Funcionario();
        f.setAltura(this.altura);
        f.setNome(this.nome);
        f.setSexo(this.sexo);
        
        return f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
