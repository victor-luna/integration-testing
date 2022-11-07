package testesVictor;

import user.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.Sprint;
import control.Tarefa;

import static org.mockito.Mockito.when;

public class TestTaxaDeSucessoPorCliente {

    Cliente cliente;

    @BeforeEach
    public void setUp2() {
        cliente = new Cliente();
    }

    @Test
    public void testarTaxaDeSucessoPorCliente() {
        Sprint sprint = Mockito.mock(Sprint.class);
        when(sprint.getSucessoNaSprint()).thenReturn(4);

        Tarefa tarefa = Mockito.mock(Tarefa.class);
        when(tarefa.getDificuldade()).thenReturn(4);

        Assertions.assertEquals("Boa", cliente.taxaDeSucessoNaSprintPorCliente(sprint, tarefa));
    }
}
