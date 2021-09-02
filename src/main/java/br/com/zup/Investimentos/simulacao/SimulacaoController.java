package br.com.zup.Investimentos.simulacao;

import br.com.zup.Investimentos.dtos.CadastroSimulacaoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/simulacao")
public class SimulacaoController {

    @Autowired
    private SimulacaoService simulacaoService;
    @Autowired
    private ModelMapper modelMapper;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)

    public Simulacao fazerSimulacao(@RequestBody @Valid CadastroSimulacaoDTO simulacaoDTO) {
        Simulacao objetoSimulacao = modelMapper.map(simulacaoDTO, Simulacao.class);
        return simulacaoService.fazerSimulacao(objetoSimulacao);
    }


}
