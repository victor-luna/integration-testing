package cliente;

public class Cliente {

    private String cpf;

    public String nome;

    public String projeto;

    public boolean contratoVigente;

    public boolean clienteRenovouContrato;

    public Cliente(String cpf, String nome, String projeto, boolean contratoVigente, boolean clienteRenovouContrato) {
        this.cpf = cpf;
        this.nome = nome;
        this.projeto = projeto;
        this.contratoVigente = contratoVigente;
        this.clienteRenovouContrato = clienteRenovouContrato;
    }

    public Cliente(boolean contratoVigente) {
        this.contratoVigente = contratoVigente;

    }

    public Cliente() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public boolean isContratoVigente() {
        return contratoVigente;
    }

    public void setContratoVigente(boolean contratoVigente) {
        this.contratoVigente = contratoVigente;
    }

    public boolean isClienteRenovouContrato() {
        return clienteRenovouContrato;
    }

    public void setClienteRenovouContrato(boolean clienteRenovouContrato) {
        this.clienteRenovouContrato = clienteRenovouContrato;
    }




}
