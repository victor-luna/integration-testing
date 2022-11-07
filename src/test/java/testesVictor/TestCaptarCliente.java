package testesVictor;

import user.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Sprint;
import control.Tarefa;

import static org.mockito.Mockito.when;

public class TestCaptarCliente {

    @Test
    public void testarCaptacaoDoCliente() {
        Tarefa tarefa = Mockito.mock(Tarefa.class);
        when(tarefa.isSquadDefinida()).thenReturn(true);

        Sprint sprint = Mockito.mock(Sprint.class);
        when(sprint.getSucessoNaSprint()).thenReturn(3);

        Cliente cliente = new Cliente();

        Assertions.assertFalse(cliente.captarCliente(tarefa, sprint));
    }
}
