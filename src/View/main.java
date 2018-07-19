package View;




import View.JPainel;
import View.JPainel;
import java.util.ArrayList;
import java.util.List;
import projeto.locadora.veiculos.Cliente;
import projeto.locadora.veiculos.ClienteTable;

public class main {

    public static void main(String[] args) throws Exception {
      JPainel painel = new JPainel();
      painel.setVisible(true);
     
      ClienteTable tb = new ClienteTable();
     
      tb.CarregaDados();
      for(Cliente d : tb.getDados()){
          System.out.print("["+d.getCodCliente()+"]"+
         "["+d.getNome()+"]"+
         "["+d.getTelefone()+"]"+
         "["+d.getEmail()+"]"+
         "["+d.getEndereço()+"]");
          System.out.println(" ");
      }
        System.out.println("Itens Carregados : " + tb.getDados().size());
      
       
    }
      
}
