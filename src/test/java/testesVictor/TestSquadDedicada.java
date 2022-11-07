package testesVictor;

import control.Tarefa;
import manager.Sprint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import user.Cliente;

import static org.mockito.Mockito.when;

public class TestSquadDedicada {

    Sprint sprint = new Sprint();

    @Test
    public void testarSquadCustomizada() {
        Tarefa tarefa = Mockito.mock(Tarefa.class);
        when(tarefa.isSquadDefinida()).thenReturn(false);

        Cliente cliente = Mockito.mock(Cliente.class);
        when(cliente.isClienteRenovouContrato()).thenReturn(false);

        Assertions.assertEquals(true, sprint.squadCustomizada(tarefa, cliente));

        Mockito.verify(cliente, Mockito.never()).getCpf();
    }
}
