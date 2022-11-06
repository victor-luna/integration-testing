package sprint;

import java.util.Date;

public class Tarefa {

    public String criadoEm;
    private String prioridade;

    public String assinanteResponsavel;

    public String comentario;

    public String squad;

    public boolean squadDefinida;

    public String cliente;

    public int dificuldade;

    public Tarefa(String criadoEm, String prioridade, String assinanteResponsavel, String comentario, String squad, boolean squadDefinida, String cliente, int dificuldade) {
        this.criadoEm = criadoEm;
        this.prioridade = prioridade;
        this.assinanteResponsavel = assinanteResponsavel;
        this.comentario = comentario;
        this.squad = squad;
        this.squadDefinida = squadDefinida;
        this.cliente = cliente;
        this.dificuldade = dificuldade;
    }

    public Tarefa(boolean squadDefinida) {
        this.squadDefinida = squadDefinida;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getAssinanteResponsavel() {
        return assinanteResponsavel;
    }

    public void setAssinanteResponsavel(String assinanteResponsavel) {
        this.assinanteResponsavel = assinanteResponsavel;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    public boolean isSquadDefinida() {
        return squadDefinida;
    }

    public void setSquadDefinida(boolean squadDefinida) {
        this.squadDefinida = squadDefinida;
    }

    public boolean criarTarefa(Cliente cliente, Sprint sprint) {
        if(cliente.isContratoVigente() && sprint.isSprintAgendada()) {
            this.criadoEm = new Date().toString();
            System.out.println("Tarefa criada com sucessso!");
            return true;
        } else {
            System.out.println("Verifique se o contrato está viagente e a sprint agendada!!");
            return false;
        }
    }

}