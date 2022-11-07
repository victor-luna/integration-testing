import control.Etiqueta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Quadro;
import control.Tarefa;

public class TestQuadro {



    @Test
    public void getNomeQuadro(){

    Quadro quadro = new Quadro("Form Trello","3",true);
    Etiqueta etiquetas = Mockito.mock(Etiqueta.class);
    Mockito.when(etiquetas.getNome());
    Assertions.assertEquals("Form Trello",quadro.getNomeQuadro());

}










}
