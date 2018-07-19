package projeto.locadora.veiculos;

import java.util.Date;

public class Locacao {
    private int codLocado;
    private Cliente cliente;
    private Veiculo veiculo;
    private Date dataLocacao;
    private Date dataDevolução;

    public int getCodLocado() {
        return codLocado;
    }

    public void setCodLocado(int codLocado) {
        this.codLocado = codLocado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolução() {
        return dataDevolução;
    }

    public void setDataDevolução(Date dataDevolução) {
        this.dataDevolução = dataDevolução;
    }
}
