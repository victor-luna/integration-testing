package testesVictor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import user.Cliente;
import manager.Sprint;
import control.Tarefa;

import static org.mockito.Mockito.*;

public class TestCriarTarefa {

    Tarefa tarefa;


    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa(true);
    }

    @Test
    public void testarCriacaoDeTarefa() {
        Cliente cliente = Mockito.mock(Cliente.class);
        when(cliente.isContratoVigente()).thenReturn(true);

        Sprint sprint = Mockito.mock(Sprint.class);
        when(sprint.isSprintAgendada()).thenReturn(true);

        Assertions.assertEquals(true, tarefa.criarTarefa(cliente, sprint));
    }
}
