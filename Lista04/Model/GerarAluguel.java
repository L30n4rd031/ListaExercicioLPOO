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
public class GerarAluguel {

    private Pessoa c;
    private Automovel a;
    private int tipo;

    public GerarAluguel(Pessoa c, Automovel a, int tipo) {
        this.c = c;
        this.a = a;
        this.tipo =  tipo;
    }

    public GerarAluguel() {
        super();
    }

    public AluguelDeAutomovel gerar() {

        if (this.tipo == 1) {
            Mensal m = new Mensal();
            m.setAutomovel(this.a);
            m.setPessoa(this.c);

            return m;

        } else {
            Diaria d = new Diaria();
            d.setAutomovel(this.a);
            d.setPessoa(this.c);

            return d;
        }

    }

}
