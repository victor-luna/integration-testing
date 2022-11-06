package sprint;

public class Resultado {

    public String resultado;

    private boolean clienteSatisfeito;

    public Resultado(String resultado, boolean clienteSatisfeito) {
        this.resultado = resultado;
        this.clienteSatisfeito = clienteSatisfeito;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean isClienteSatisfeito() {
        return clienteSatisfeito;
    }

    public void setClienteSatisfeito(boolean clienteSatisfeito) {
        this.clienteSatisfeito = clienteSatisfeito;
    }
}
