package com.elosete.testesUnitarios.testesModelo;

import com.elosete.modelo.Comandos;
import com.elosete.modelo.EstacaoEspacial;
import com.elosete.modelo.Planetas;
import com.elosete.modelo.Sentido;
import com.elosete.modelo.Sondas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EstacaoEspacialTest {

    @InjectMocks
    private EstacaoEspacial estacaoEspacial;

    @Mock
    private Planetas planeta;

    @Test
    public void deveAdicionarSondaNoPlaneta() {
        assertThat(estacaoEspacial.adicionaSondaNoPlaneta(mock(Sentido.class))).isNotNull();
    }

    @Test
    public void deveMoverSonda() {
        final Comandos comando = Comandos.MOVE;
        final Sondas sonda = mock(Sondas.class);

        estacaoEspacial.mover(comando, sonda);
        verify(sonda, only()).andarParaFrente();
    }

}
