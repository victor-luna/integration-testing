package manager;

import control.Trello;


public class TrelloEntidade {


    protected Trello trelloService;

    @SuppressWarnings("unchecked")
    public <T extends TrelloEntidade> T setInternaTrello(Trello trelloService) {
        this.trelloService = trelloService;
        return (T) this;
    }

    protected Trello getTrelloService() {
        if (trelloService == null)
            throw new IllegalStateException("O trelloService não foi inicializado. Por favor, chame setInternaTrello antes.");

        return trelloService;
    }

    public void getCor(String verde) {
    }
}
