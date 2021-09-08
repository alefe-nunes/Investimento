package br.com.zup.Investimentos;

import br.com.zup.Investimentos.dtos.CadastroSimulacaoDTO;
import br.com.zup.Investimentos.simulacao.Simulacao;
import br.com.zup.Investimentos.simulacao.SimulacaoController;
import br.com.zup.Investimentos.simulacao.SimulacaoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(SimulacaoController.class)
public class SimulacaoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SimulacaoService simulacaoService;

    private CadastroSimulacaoDTO cadastroSimulacaoDTO;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {

        CadastroSimulacaoDTO cadastroSimulacaoDTO = new CadastroSimulacaoDTO();

        cadastroSimulacaoDTO.setNomeDoInteressado("Vinicius");
        cadastroSimulacaoDTO.setEmailDoInteressado("vinicius@gmail.com");
        cadastroSimulacaoDTO.setTelefoneDoInteressado("(11) 99872637");
        cadastroSimulacaoDTO.setDinheiroInvestido(1000.00);
        cadastroSimulacaoDTO.setMesesDoInvestimento(12);

        ObjectMapper objectMapper = new ObjectMapper();

    }

    @Test
    public void testarFazerSimulacaoCaminhoPositivo() throws Exception {

        Mockito.when(simulacaoService.fazerSimulacao(Mockito.any(Simulacao.class)))
                .thenReturn(1000.00);

        String json = objectMapper.writeValueAsString(cadastroSimulacaoDTO);

        ResultActions resultActions = mockMvc
                .perform(MockMvcRequestBuilders.put("/simulacao")
                        .contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", )
                        .equalTo(cadastroSimulacaoDTO.getEmailDoInteressado()));

    }


}
