package plataforma;

public class Plataforma {

    public String nomeDaPlataforma;

    public String plano;

    public Plataforma(String nomeDaPlataforma, String plano) {
        this.nomeDaPlataforma = nomeDaPlataforma;
        this.plano = plano;
    }

    public String getNomeDaPlataforma() {
        return nomeDaPlataforma;
    }

    public void setNomeDaPlataforma(String nomeDaPlataforma) {
        this.nomeDaPlataforma = nomeDaPlataforma;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}
