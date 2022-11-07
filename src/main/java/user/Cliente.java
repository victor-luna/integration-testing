package user;

import manager.Sprint;
import control.Tarefa;

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


    public boolean captarCliente(Tarefa tarefa, Sprint sprint) {
        if(tarefa.isSquadDefinida() && sprint.getSucessoNaSprint() > 4) {
            System.out.println("Squad definida e sucesso na sprint anterior, captação de cliente autorizada!");
            return true;
        } else {
            System.out.println("Não foi possível captar o cliente, verifique se a squad já está definida e se obteve sucesso na sprint anterior");
            return false;
        }
    }

    public String taxaDeSucessoNaSprintPorCliente(Sprint sprint, Tarefa tarefa) {
        if(sprint.getSucessoNaSprint() <= 3 && tarefa.getDificuldade() > 3) {
            return "Ruim";
        } else if (sprint.getSucessoNaSprint() == 4 && tarefa.getDificuldade() > 3) {
            return "Boa";
        } else {
            return "Muito boa";
        }
    }




}
