package control;

public class Etiqueta {

    public String nome;

    public boolean marcacaoTarefa;

    public String criarMarcacao;

    public String quantidadeEtiquetas;


    public Etiqueta(String nome, boolean marcacaoTarefa, String criarMarcacao, String quantidadeEtiquetas) {
        this.nome = nome;
        this.marcacaoTarefa = marcacaoTarefa;
        this.criarMarcacao = criarMarcacao;
        this.quantidadeEtiquetas = quantidadeEtiquetas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriarMarcacao() {
        return criarMarcacao;
    }

    public void setCriarMarcacao(String criarMarcacao) {
        this.criarMarcacao = criarMarcacao;
    }

    public boolean getMarcacaoTarefa() {
        return marcacaoTarefa;
    }

    public void setMarcacaoTarefa(boolean marcacaoTarefa) {
        this.marcacaoTarefa = marcacaoTarefa;
    }

    public String getQuantidadeEtiquetas() {
        return quantidadeEtiquetas;
    }

    public void setQuantidadeEtiquetas(String quantidadeEtiquetas) {
        this.quantidadeEtiquetas = quantidadeEtiquetas;
    }

}


