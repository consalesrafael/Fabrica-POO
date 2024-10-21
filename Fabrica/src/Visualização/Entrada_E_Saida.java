package Visualização;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import Modelo.Carro;

public class Entrada_E_Saida {
    
    public static String solicitaModelo(){

        String[] modelo = {"X1","G20","X4","X5"};
        JComboBox<String> menuModelo = new JComboBox<String>(modelo);
        JOptionPane.showConfirmDialog(null, menuModelo, "Qual o modelo do carro?", JOptionPane.OK_CANCEL_OPTION);
        return menuModelo.getSelectedItem().toString();
    }

    public static int solicitaAno(){

        int ano = -1;       
            ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabricação do carro"));        
        return ano;                
        
    }

    public static String solicitaCor(){

        String[] cor = {"Vermelho","Preto","Azul","branco"};
        JComboBox<String> menuCor = new JComboBox<String>(cor);
         JOptionPane.showConfirmDialog(null, menuCor, "Qual a cor do carro?", JOptionPane.OK_CANCEL_OPTION);
        return menuCor.getSelectedItem().toString();
    }

    public static String solicitaTipo(){
        
        String[] tipo = {"Hatch","Sedã","SUV","Picape","Crossover","Perua","Minivan","Esportivo"};
        JComboBox<String> menuTipo = new JComboBox<String>(tipo);
        JOptionPane.showConfirmDialog(null, menuTipo, "Qual é o tipo do carro",JOptionPane.OK_CANCEL_OPTION);
        return menuTipo.getSelectedItem().toString();
        
    }

    public static int solicitaQuantidade(){       

        int quantidade=0;
        while (quantidade <=0) {
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros voce quer criar?"));       
        }
        return quantidade;

  }

    public static int solicitaMenu(){

        String[] menu = {"Vender Carro","Consultar Carros fabricados","Contruir carro","Sair do programa"};
        JComboBox<String> mostrarMenu =new JComboBox<String>(menu);
        JOptionPane.showConfirmDialog(null, mostrarMenu, "Qual função você deseja?",JOptionPane.OK_CANCEL_OPTION);
        return mostrarMenu.getSelectedIndex();

    }

    public static void encerraPrograma(){

        JOptionPane.showMessageDialog(null, "Encerrando programa");

    }
    
    public static void mostrarCarros(ArrayList<Carro> listaDeCarros){

        StringBuilder sb = new StringBuilder();
        if (listaDeCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não ha carros para ver");
            return;        
        }

            for(int x = 0; x < listaDeCarros.size(); x++){
                Carro carro = listaDeCarros.get(x);
                sb.append("°"+carro.getModeloCarro()+"-"+carro.getAnoDeFabricacao()+"-"+carro.getCor()+"\n")
                .append("______________________________\n");

            }

            JOptionPane.showMessageDialog(null, sb.toString());
    }
    
}
