package testesVictor;

import user.Cliente;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Sprint;
import control.Tarefa;

import static org.mockito.Mockito.when;

public class TestAgendarSprint {

    @AfterAll
    public static void finalMessage() {
        System.out.println("Teste de agendamento da sprint finalizado, verifique o resultado.");
    }

    @Test
    public void testarAgendamentoDaSprint() {
        Cliente cliente = Mockito.mock(Cliente.class);
        when(cliente.isContratoVigente()).thenReturn(true);

        Tarefa tarefa = Mockito.mock(Tarefa.class);
        when(tarefa.isTarefasRemanescentes()).thenReturn(false);

        Sprint sprint = new Sprint();

        Assertions.assertTrue(sprint.possibilidadeDeNovaSprint(tarefa, cliente));

        Mockito.verify(cliente, Mockito.atMost(2)).isContratoVigente();
    }
}
