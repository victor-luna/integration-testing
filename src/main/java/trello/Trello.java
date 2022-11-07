package trello;

import Board.Checklist;

public interface Trello {
    Checklist criarEtiqueta(Checklist checklist);

    Checklist updateEtiqueta(Checklist checklist);

    void addEtiquetaCard(String cardId, String id);
}
