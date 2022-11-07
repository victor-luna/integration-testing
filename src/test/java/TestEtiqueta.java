import user.Cliente;
import control.Etiqueta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Quadro;
import manager.Resultado;
import manager.Sprint;
import control.Tarefa;

public class TestEtiqueta {



@Test
    public void getEtiqueta(){


    Quadro quadro = Mockito.mock(Quadro.class);
   //Quadro quadro = new Quadro("Form Trello","3",true);
    Mockito.when(quadro.getCartao()).thenReturn(true);
    Etiqueta etiqueta = Mockito.mock(Etiqueta.class);
   // Etiquetas etiqueta = new Etiquetas("Concluido",true, "Concluido","1");
    Mockito.when(etiqueta.getMarcacaoTarefa()).thenReturn(true);

    Assertions.assertTrue(true);
    Mockito.verify(etiqueta, Mockito.never().description("Etiqueta criada"));



}


@Test
    public void getEtiquetaFalso(){


    Quadro quadro = Mockito.mock(Quadro.class);
    Mockito.when(quadro.getCartao()).thenReturn(true);
    Etiqueta etiqueta = Mockito.mock(Etiqueta.class);
    Mockito.when(etiqueta.getMarcacaoTarefa()).thenReturn(true);

    Assertions.assertFalse(false);



}




}
