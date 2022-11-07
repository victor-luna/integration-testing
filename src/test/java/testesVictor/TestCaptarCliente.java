package testesVictor;

import user.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Sprint;
import control.Tarefa;

import static org.mockito.Mockito.when;

public class TestCaptarCliente {
    Cliente cliente = new Cliente();
    @Test
    public void testarCaptacaoDoCliente() {
        Tarefa tarefa = Mockito.mock(Tarefa.class);
        when(tarefa.isSquadDefinida()).thenReturn(true);

        Sprint sprint = Mockito.mock(Sprint.class);
        when(sprint.getSucessoNaSprint()).thenReturn(3);

        Assertions.assertFalse(cliente.captarCliente(tarefa, sprint));

        Mockito.verify(sprint, Mockito.atLeast(1)).getSucessoNaSprint();
    }
}
