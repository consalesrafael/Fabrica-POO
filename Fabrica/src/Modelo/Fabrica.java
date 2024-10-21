package Modelo;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Visualização.Entrada_E_Saida;

public class Fabrica {

    public static void venderCarro(ArrayList<Carro> listaDeCarro){

        JComboBox<String> carroComboBox = new JComboBox<>();

        if (listaDeCarro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não ha carros para vender");
            return;        
        }

         for(Carro carro : listaDeCarro){           
            carroComboBox.addItem(carro.getModeloCarro()+"-"+carro.getAnoDeFabricacao()+"-"+carro.getCor());
         }
         
         int resultado = JOptionPane.showConfirmDialog(null, carroComboBox, 
                                               "Selecione um carro para vender", JOptionPane.OK_CANCEL_OPTION);
                
        if (resultado == JOptionPane.OK_OPTION) {
            int indiceSelecionado = carroComboBox.getSelectedIndex();
            Carro carroSelecionado = listaDeCarro.get(indiceSelecionado);

            int confirmacao = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja vender o carro do modelo: "
                                                                 +carroSelecionado.getModeloCarro()+" Ano: "+carroSelecionado.getAnoDeFabricacao()+ 
                                                                                                " da cor: "+carroSelecionado.getCor());
                if (confirmacao == JOptionPane.OK_OPTION) {

                 JOptionPane.showMessageDialog(null, "Carro vendido");
                 listaDeCarro.remove(indiceSelecionado);
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Venda cancelada");
        }
    }

    public static void fabricarCarro(ArrayList<Carro> listaDeCarro, int quantidade){
         
          quantidade = Entrada_E_Saida.solicitaQuantidade();                         
            for(int x = 0; x < quantidade; x++ ){

                Carro carro = new Carro();
                carro.setModeloCarro(Entrada_E_Saida.solicitaModelo());
                carro.setAnoDeFabricacao(Entrada_E_Saida.solicitaAno()); 
                carro.setCor(Entrada_E_Saida.solicitaCor()); 
                carro.setTipo(Entrada_E_Saida.solicitaTipo()); 
                listaDeCarro.add(carro);

            }      
    }

    
}

