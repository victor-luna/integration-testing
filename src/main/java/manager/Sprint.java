package manager;

import user.Cliente;
import control.Tarefa;

public class Sprint {

    private int id;

    public String mesDaSprint;

    public String tempoDaSprint;

    private int sucessoNaSprint;

    public boolean sprintAgendada;

    private boolean squadDedicadaExclusivamente;

    public Sprint(int id, String mesDaSprint, String tempoDaSprint, int sucessoNaSprint, boolean sprintAgendada, boolean squadDedicadaExclusivamente) {
        this.id = id;
        this.mesDaSprint = mesDaSprint;
        this.tempoDaSprint = tempoDaSprint;
        this.sucessoNaSprint = sucessoNaSprint;
        this.sprintAgendada = sprintAgendada;
        this.squadDedicadaExclusivamente = squadDedicadaExclusivamente;
    }

    public Sprint() {
    }

    public String getMesDaSprint() {
        return mesDaSprint;
    }

    public void setMesDaSprint(String mesDaSprint) {
        this.mesDaSprint = mesDaSprint;
    }

    public String getTempoDaSprint() {
        return tempoDaSprint;
    }

    public void setTempoDaSprint(String tempoDaSprint) {
        this.tempoDaSprint = tempoDaSprint;
    }

    public int getSucessoNaSprint() {
        return sucessoNaSprint;
    }

    public void setSucessoNaSprint(int sucessoNaSprint) {
        this.sucessoNaSprint = sucessoNaSprint;
    }

    public boolean isSprintAgendada() {
        return sprintAgendada;
    }

    public void setSprintAgendada(boolean sprintAgendada) {
        this.sprintAgendada = sprintAgendada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSquadDedicadaExclusivamente() {
        return squadDedicadaExclusivamente;
    }

    public void setSquadDedicadaExclusivamente(boolean squadDedicadaExclusivamente) {
        this.squadDedicadaExclusivamente = squadDedicadaExclusivamente;
    }

    public boolean possibilidadeDeNovaSprint(Tarefa tarefa, Cliente cliente) {
        if(!tarefa.isTarefasRemanescentes() && cliente.isContratoVigente()) {
            System.out.println("Sprint nº 01 foi iniciada com sucesso.");
            return true;
        } else {
            System.out.println("Verifique se o contrato está viagente e se existem tarefas remanescentes!");
            return false;
        }
    }

    public boolean squadCustomizada(Tarefa tarefa, Cliente cliente) {
        if (!tarefa.squadDefinida && !cliente.isClienteRenovouContrato()) {
            System.out.println("Os índices estão ruins, é recomendável uma squad dedicada para esse cliente.");
            return true;
        } else {
            System.out.println("O cliente não necessita de uma squad dedicada no momento.");
            return false;
        }
    }
}
