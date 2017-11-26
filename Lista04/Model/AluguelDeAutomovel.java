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
public abstract class AluguelDeAutomovel {
    protected float preco;
    protected int prazo;
    protected float multa;
    Pessoa pessoa;
    Automovel automovel;

    public AluguelDeAutomovel(float preco, int prazo, float multa) {
        
        this.preco = preco;
        this.prazo = prazo;
        this.multa = multa;
        
    }
    
    public double getAluguel(){
        return (this.preco * this.prazo) + this.multa;
    }
    
    public AluguelDeAutomovel(){
         
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
}
