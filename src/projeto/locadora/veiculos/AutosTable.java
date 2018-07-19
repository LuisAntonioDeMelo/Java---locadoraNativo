
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

public class AutosTable  extends AbstractTableModel{
    
    private List <Veiculo> dados ;
    private String[] colunas = {"Codigo","Marca","Modelo","Placa"};

    public AutosTable() {
        dados = new ArrayList<Veiculo>();
    }

    //@popular lista com o arrayList
    public AutosTable( List <Veiculo> data) {
        this();
        dados.addAll(data);
    }
 
    public List<Veiculo> CarregaDados() throws IOException,Exception {
            try{
                 BufferedReader reader = new BufferedReader(new FileReader("C:\\Dados\\veiculos.txt"));
                 int a = 1;
                 String linha ="";
                 while( (linha = reader.readLine()) != null ){ 
                 Veiculo v = new Veiculo(); 
                 String[]col = linha.split(";"); 
                      v.setCodVeiculo(Integer.parseInt(col[0]));
                      v.setMarca(col[1]);
                      v.setModelo(col[2]);
                      v.setPlaca(col[3]);
                      v.isLocado();
                    dados.add(v);
                   
                  }
                 return dados; 
            }
            catch(IOException e){
                 e.printStackTrace();
                throw e;
            }
           
    }

    
    public void addCols(Veiculo v){
        this.dados.add(v);
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
                 getDados().get(linha).setCodVeiculo(Integer.parseInt((String)valor));
                 break;
             case 1:
                 getDados().get(linha).setMarca((String)valor);
                 break;
             case 2:
                 getDados().get(linha).setModelo((String)valor);
                 break;
             case 3:
                getDados().get(linha).setPlaca((String)valor);
                break;
             case 4:
                 getDados().get(linha).isLocado();
                 break;
         }
         this.fireTableRowsUpdated(linha, linha);
        
    }

    
    
    @Override
    public Object getValueAt(int linha, int coluna) {
         switch(coluna){
             case 0:
                 return getDados().get(linha).getCodVeiculo();
             case 1:
                 return getDados().get(linha).getMarca();
             case 2:
                 return getDados().get(linha).getModelo();
             case 3:
                 return getDados().get(linha).getModelo();
             case 4:
                 return getDados().get(linha).isLocado();
         }
         return null;
    }

    public List <Veiculo> getDados() {
        return dados;
    }

 

   
}
