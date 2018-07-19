package projeto.locadora.veiculos;
public class Veiculo {
    private int codVeiculo;
    private String placa;
    private String marca;
    private String Modelo;
    private boolean locado;

    public Veiculo() {
    }

    public Veiculo(int codVeiculo, String placa, String marca, String Modelo, boolean locado) {
        this.codVeiculo = codVeiculo;
        this.placa = placa;
        this.marca = marca;
        this.Modelo = Modelo;
        this.locado = locado;
    }

    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public boolean isLocado() {
        return locado == true;
    }

   
   
    
    
}
