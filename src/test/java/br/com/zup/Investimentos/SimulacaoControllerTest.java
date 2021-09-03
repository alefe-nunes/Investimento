package br.com.zup.Investimentos;

import br.com.zup.Investimentos.dtos.CadastroSimulacaoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class SimulacaoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SimulacaoServiceTest simulacaoServiceTest;

    private CadastroSimulacaoDTO cadastroSimulacaoDTO;
    private ModelMapper modelMapper;

    @BeforeEach
    public void setUp () {

        CadastroSimulacaoDTO cadastroSimulacaoDTO = new CadastroSimulacaoDTO();

        cadastroSimulacaoDTO.setNomeDoInteressado("Vinicius");
        cadastroSimulacaoDTO.setEmailDoInteressado("vinicius@gmail.com");
        cadastroSimulacaoDTO.setTelefoneDoInteressado("(11) 99872637");
        cadastroSimulacaoDTO.setDinheiroInvestido(1000.00);
        cadastroSimulacaoDTO.setMesesDoInvestimento(12);

        ObjectMapper objectMapper = new ObjectMapper();

        @Test





    }



}
