package user;

import manager.TrelloEntidade;

public class Checklist extends TrelloEntidade {
    private String id;
    private String idBoard;
    private String cor;
    private String nome;

    public Checklist criar(){
        Checklist checklist = getTrelloService().criarEtiqueta(this);
        id = checklist.id;

        return this;
    }
    public Checklist update(){
        Checklist updateChecklist = getTrelloService().updateEtiqueta(this);

        id = updateChecklist.id;
        idBoard = updateChecklist.idBoard;
        cor = updateChecklist.cor;
        nome = updateChecklist.nome;

        return this;

    }
    public Checklist addCard(String cardId){
        getTrelloService().addEtiquetaCard(cardId, id);

        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
