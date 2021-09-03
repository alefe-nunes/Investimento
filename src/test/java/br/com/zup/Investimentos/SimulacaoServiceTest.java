package br.com.zup.Investimentos;

import br.com.zup.Investimentos.simulacao.SimulacaoRepository;
import br.com.zup.Investimentos.simulacao.SimulacaoService;
import org.junit.jupiter.api.Test;
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
    public void testarMetodoFazerSimulacao





}
