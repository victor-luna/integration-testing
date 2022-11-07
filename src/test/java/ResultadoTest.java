import control.Plataforma;
import control.Tarefa;
import manager.Resultado;
import user.Checklist;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class ResultadoTest {

    @Test
    public void ResultaoPagamentoPlanoTest (){
        Tarefa tarefa = new Tarefa(true);
        Plataforma plataforma = Mockito.mock(Plataforma.class);
        Mockito.when(plataforma.getPlano()).thenReturn("pago");
        Resultado resultado = new Resultado("Satisfeito",true);
        tarefa.setCliente("Everson");
        assertFalse(false, resultado.getResultado());
    }

    @Test
    public void TestDeChecklist(){
        Checklist checklist = Mockito.mock(Checklist.class);
        Mockito.verify(checklist, Mockito.never()).getCor("Verde");
    }

}
