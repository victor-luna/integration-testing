package manager;

public class Quadro {              //exite quadros tabelas calendarios no trello

    public  String nomeQuadro;

    public String qntSprints;   //or boolean

    public boolean Cartao;


    public Quadro(String nomeQuadro, String qntSprints, boolean Cartao){
        this.nomeQuadro = nomeQuadro;
        this.qntSprints = qntSprints;
        this.Cartao = Cartao;

    }





    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }


    public String getQntSprints() {
        return qntSprints;
    }

    public void setQntSprints(String qntSprints) {
        this.qntSprints = qntSprints;
    }

    public boolean getCartao() {
        return Cartao;
    }

    public void setCartao(boolean Cartao) {
        this.Cartao = Cartao;
    }
}


