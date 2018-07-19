
package projeto.locadora.veiculos;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ClienteTable  extends AbstractTableModel{
    
    private List <Cliente> dados ;
    private String[] colunas = {"Codigo","Nome","Telefone","E-mail","Endereço"};

    public ClienteTable() {
        dados = new ArrayList<Cliente>();
    }

    //@popular lista com o arrayList
    public ClienteTable( List <Cliente> data) {
        this();
        dados.addAll(data);
    }
 
    public List<Cliente> CarregaDados() throws IOException,Exception {
            try{
                 BufferedReader reader = new BufferedReader(new FileReader("C:\\Dados\\clientes.txt"));
                 int a = 1;
                 String linha ="";
                 while( (linha = reader.readLine()) != null ){ 
                 Cliente c = new Cliente(); 
                 String[]col = linha.split(";"); 
                      c.setCodCliente(Integer.parseInt(col[0]));
                      c.setNome(col[1]);
                      c.setTelefone(col[2]);
                      c.setEmail(col[3]);
                      c.setEndereço(col[4]);
                    dados.add(c);
                   
                  }
                 return dados; 
            }
            catch(IOException e){
                 e.printStackTrace();
                throw e;
            }
           
    }

    
    public void addCols(Cliente c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void RemoveCols(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    
    @Override
    public int getRowCount() {
     return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
         switch(coluna){
             case 0:
                 getDados().get(linha).setCodCliente(Integer.parseInt((String)valor));
                 break;
             case 1:
                 getDados().get(linha).setNome((String)valor);
                 break;
             case 2:
                 getDados().get(linha).setTelefone((String)valor);
                 break;
             case 3:
                getDados().get(linha).setEmail((String)valor);
                break;
             case 4:
                 getDados().get(linha).setEndereço((String)valor);
                 break;
         }
         this.fireTableRowsUpdated(linha, linha);
        
    }

    
    
    @Override
    public Object getValueAt(int linha, int coluna) {
         switch(coluna){
             case 0:
                 return getDados().get(linha).getCodCliente();
             case 1:
                 return getDados().get(linha).getNome();
             case 2:
                 return getDados().get(linha).getTelefone();
             case 3:
                 return getDados().get(linha).getEmail();
             case 4:
                 return getDados().get(linha).getEndereço();
         }
         return null;
    }

    public List <Cliente> getDados() {
        return dados;
    }

 

   
}
