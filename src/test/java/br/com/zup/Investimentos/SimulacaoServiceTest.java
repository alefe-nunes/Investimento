package br.com.zup.Investimentos;

import br.com.zup.Investimentos.simulacao.Simulacao;
import br.com.zup.Investimentos.simulacao.SimulacaoRepository;
import br.com.zup.Investimentos.simulacao.SimulacaoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class SimulacaoServiceTest {

    @Autowired
    private SimulacaoService simulacaoService;

    @MockBean
    private SimulacaoRepository simulacaoRepository;

    @Test
    public void testarMetodoFazerSimulacaoCaminhoPositivo () {

        Simulacao simulacao = new Simulacao();
        simulacao.setDinheiroInvestido(1000.00);
        simulacao.setMesesDoInvestimento(12);

        Mockito.when(simulacaoRepository.save(Mockito.any(Simulacao.class)))
                .thenReturn(simulacao);

        Assertions.assertEquals(60.00, simulacaoService.fazerSimulacao(simulacao));
    }

    @Test
    public void testarMetodoCalcularInvestimentoCaminhoPositivo () {

        Simulacao simulacao = new Simulacao();
        simulacao.setDinheiroInvestido(1000.00);
        simulacao.setMesesDoInvestimento(12);

        Mockito.when(simulacaoRepository.save(Mockito.any(Simulacao.class)))
                .thenReturn(simulacao);

        Assertions.assertEquals(60.00, simulacaoService.calcularInvestimento(simulacao));
    }






}
