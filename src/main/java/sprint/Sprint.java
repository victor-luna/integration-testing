package sprint;

public class Sprint {

    public String mesDaSprint;

    public String tempoDaSprint;

    private boolean sucessoNaSprint;

    public boolean sprintAgendada;

    public Sprint(String mesDaSprint, String tempoDaSprint, boolean sucessoNaSprint, boolean sprintAgendada) {
        this.mesDaSprint = mesDaSprint;
        this.tempoDaSprint = tempoDaSprint;
        this.sucessoNaSprint = sucessoNaSprint;
        this.sprintAgendada = sprintAgendada;
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

    public boolean isSucessoNaSprint() {
        return sucessoNaSprint;
    }

    public void setSucessoNaSprint(boolean sucessoNaSprint) {
        this.sucessoNaSprint = sucessoNaSprint;
    }

    public boolean isSprintAgendada() {
        return sprintAgendada;
    }

    public void setSprintAgendada(boolean sprintAgendada) {
        this.sprintAgendada = sprintAgendada;
    }
}
