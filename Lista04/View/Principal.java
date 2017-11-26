
package View;

import Controller.CaminhaoController;
import Controller.CarroController;
import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.GerarAluguelController;
import Model.AluguelDeAutomovel; // Tipo para Atributo
import Model.Automovel; // Tipo para Atributo
import Model.Pessoa; // Tipo para Atributo
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */

public class Principal {

    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    static ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
    static ArrayList<AluguelDeAutomovel> alugueis = new ArrayList<AluguelDeAutomovel>();
    
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op;
        do {            
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Pessoa\n2 - Automovel\n3 - Aluguel\n4 - Sair"));
            switch (op) {
                case 1:
                    cadastraPessoa();
                    break;
                case 2:
                    cadastraAutomovel();
                    break;
                case 3:
                    gerarAluguel();
                    break;
            }
            
            if(op == 4){ // Tratando entrada
                int r = JOptionPane.showConfirmDialog(null, "Confirma Saída");
                if(r == 1){
                    op = 0;
                }                
            }
        } while (op != 4);
    }

    public static void cadastraPessoa() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu Pessoa:\n1 - Cadastrar Cliente\n2 - Cadastrar Funcionário\n3 - Ver Relatório QTD Pessoas\n0 - Voltar"));
            switch (op) {
                case 1:
                    cadastraCliente();
                    break;
                case 2:
                    cadastraFuncionario();
                    break;               
                case 3:
                    relatorioPessoa();
                    break;               
                    
            }
        }while (op != 0);
    }
    
    public static void relatorioPessoa(){        
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas cadastradas \n"+pessoas.size());
    }

    public static void cadastraCliente() {
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        
        ClienteController c = new ClienteController();
        c.setAltura(altura);
        c.setNome(nome);
        c.setSexo(sexo);
        pessoas.add(c.getObjetoCliente());
    }

    public static void cadastraFuncionario() {
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        String nome = JOptionPane.showInputDialog("Nome: ");
        String sexo = JOptionPane.showInputDialog("Sexo: ");
        
        FuncionarioController f = new FuncionarioController();
        f.setAltura(altura);
        f.setNome(nome);
        f.setSexo(sexo);
        pessoas.add(f.getObjetoCliente());
    }

    public static void cadastraAutomovel() {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu Automovel:\n1 - Cadastrar Carro\n2 - Cadastrar Caminhão\n3 - Ver relatório QTD Automóveis\n0 - Voltar"));
            switch (op) {
                case 1:
                    cadastraCarro();
                    break;
                case 2:
                    cadastraCaminhao();
                    break;     
                case 3:
                    relatorioAutomovel();
                    break;     
                                    
            }
        } while (op != 0);
    }
    
    public static void relatorioAutomovel(){        
        JOptionPane.showMessageDialog(null, "Quantidade de automóveis cadastradas \n"+automoveis.size());
    }

    public static void cadastraCarro() {
        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String cor = JOptionPane.showInputDialog("Cor: ");
        String chassi = JOptionPane.showInputDialog("Chassi: ");
        
        CarroController c = new CarroController();
        c.setChassi(chassi);
        c.setCor(cor);
        c.setMarca(marca);
        c.setModelo(modelo);
        automoveis.add(c.getObjetoCarro());
    }

    public static void cadastraCaminhao() {
        String eixo = JOptionPane.showInputDialog("Eixo: ");
        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String cor = JOptionPane.showInputDialog("Cor: ");
        String chassi = JOptionPane.showInputDialog("Chassi: ");
        
        CaminhaoController c = new CaminhaoController();
        c.setEixo(eixo);
        c.setChassi(chassi);
        c.setCor(cor);
        c.setMarca(marca);
        c.setModelo(modelo);
        automoveis.add(c.getObjetoCaminhao());
    }

    public static void gerarAluguel() {
        
        String nome = JOptionPane.showInputDialog("Digite o nome da Pessoa:");
        
        String chassi = JOptionPane.showInputDialog("Digite o Chassi do Carro:");
        
        int idPessoa = -1;
        int idAutomovel = -1;
        
        for(int i = 0; i < pessoas.size(); i++){ // Percorrendo arraylist até encontrar combinação com o nome digitado
            
            if(pessoas.get(i).getNome().equals(nome)){
                idPessoa = i;
                break;
            }
            
        }
        
        for(int i = 0; i < automoveis.size(); i++) {
            if(automoveis.get(i).getChassi().equals(chassi)){
                idAutomovel = i;
                break;
            }
        }
        
        // Tratamento de Respostas
        if(idPessoa < 0) {
            
        } else if(idAutomovel < 0){
            
        } else {                                   
            // Pessoa,              Automovel,              tipo de aluguel
            GerarAluguelController gAluguel = new GerarAluguelController();
            gAluguel.setCliete(pessoas.get(idPessoa));
            gAluguel.setAuto(automoveis.get(idAutomovel));
            gAluguel.setTipo(1);
            gAluguel.gerarAluguel();
            JOptionPane.showMessageDialog(null, gAluguel.getRetornoMsg());
        }
        
        
    }
}
