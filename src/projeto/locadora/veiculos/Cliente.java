package projeto.locadora.veiculos;
public class Cliente {
    private int codCliente;
    private String nome;
    private String telefone;
    private String email;
    private String Endereço;

    public Cliente() {
    }

    public Cliente(int codCliente, String nome, String telefone, String email, String Endereço) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Endereço = Endereço;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }
    
    
    
}
