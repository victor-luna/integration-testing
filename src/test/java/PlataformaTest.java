
import user.Membro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import manager.AreaTrabalho;
import control.Plataforma;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class PlataformaTest {

    @Test
    public void ConcederAcessoDeMembroParaAreaDeTrabalhoTest() {

        Plataforma plataforma = new Plataforma(null, null, null, null, false, true);

        Membro membro = Mockito.mock(Membro.class);
        when(membro.isAdmin()).thenReturn(true);

        AreaTrabalho areatrabalho = Mockito.mock(AreaTrabalho.class);
        when(areatrabalho.isDesbloqueado()).thenReturn(true);

        Assertions.assertEquals(true, plataforma.concederAcesso(membro, areatrabalho));

        Mockito.verify(areatrabalho, Mockito.never()).getCalendario();
    }

    @Test
    public void MembroCriarNovaAreaDeTrabalhoTest() {

        Plataforma plataforma = new Plataforma(null, null, null, null, false, true);

        Membro membro = Mockito.mock(Membro.class);
        when(membro.getUsuario()).thenReturn("@pro");

        AreaTrabalho areatrabalho = Mockito.mock(AreaTrabalho.class);
        when(areatrabalho.getQuantidade()).thenReturn(2);

        Assertions.assertEquals("É possível criar uma nova área de trabalho. Prosseguir!", plataforma.criarAreaTrabalhoExtra(membro, areatrabalho));

    }

    @Test
    public void BloqueioDeAreaDeTrabalhoPorMembroTest() {

        Plataforma plataforma = new Plataforma(null, null, null, null, false, true);

        AreaTrabalho areatrabalho = Mockito.mock(AreaTrabalho.class);
        when(areatrabalho.isDesbloqueado()).thenReturn(true);

        Membro membro = Mockito.mock(Membro.class);
        when(membro.getUsuario()).thenReturn("@newbie");

        Assertions.assertFalse(plataforma.bloquearArea(areatrabalho, membro));

        Mockito.verify(membro, Mockito.atLeast(1)).getUsuario();

    }

    @Test
    public void MembroNaoConseguirCriarAreaDeTrabalhoExtraTest() {

        Plataforma plataforma = new Plataforma(null, null, null, null, false, true);

        Membro membro = Mockito.mock(Membro.class);
        when(membro.getUsuario()).thenReturn("@pro");

        AreaTrabalho areatrabalho = Mockito.mock(AreaTrabalho.class);
        when(areatrabalho.getQuantidade()).thenReturn(0);

        Assertions.assertEquals("ERRO: Você ainda não tem uma área de trabalho inicial!", plataforma.criarAreaTrabalhoExtra(membro, areatrabalho));

        Mockito.verify(areatrabalho, Mockito.atMost(1)).getQuantidade();

    }

    @Test
    public void MudancaDeTamanhoDaFontePorMembroTest() {

        Plataforma plataforma = new Plataforma(null, null, null, null, false, true);

        Membro membro = Mockito.mock(Membro.class);
        when(membro.isAdmin()).thenReturn(true);

        AreaTrabalho areatrabalho = Mockito.mock(AreaTrabalho.class);
        when(areatrabalho.getTamanhoFonte()).thenReturn(18);

        Assertions.assertTrue(plataforma.fonteSizePermitida(membro, areatrabalho));

        Mockito.verify(membro, times(1)).isAdmin();

    }

}
