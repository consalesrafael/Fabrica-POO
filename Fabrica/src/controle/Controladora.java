package controle;

import Modelo.Carro;
import Modelo.Fabrica;
import Visualização.Entrada_E_Saida;
import java.util.ArrayList;

public class Controladora {
    
    public void exibirMenu(){
              
        int quantidade=0;
        int opcaoMenu;
                            
        ArrayList<Carro> listaDeCarro = new ArrayList<>();
        Fabrica.fabricarCarro(listaDeCarro, quantidade);                       
        
        
        
     do{
        opcaoMenu = Entrada_E_Saida.solicitaMenu();
        switch (opcaoMenu) {
            case 0:
                Fabrica.venderCarro(listaDeCarro);
                break;
        
            case 1: 
               Entrada_E_Saida.mostrarCarros(listaDeCarro);
                break;
            case 2:
                 Fabrica.fabricarCarro(listaDeCarro, quantidade);

                break;                             
         }          
        }while (opcaoMenu!=3); 
             Entrada_E_Saida.encerraPrograma();
               System.exit(0);
          
       
    }
}

