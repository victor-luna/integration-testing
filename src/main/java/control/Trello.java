package control;

import user.Checklist;

public interface Trello {
    Checklist criarEtiqueta(Checklist checklist);

    Checklist updateEtiqueta(Checklist checklist);

    void addEtiquetaCard(String cardId, String id);
}
