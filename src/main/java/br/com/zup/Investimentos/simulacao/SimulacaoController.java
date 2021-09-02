package br.com.zup.Investimentos.simulacao;

import br.com.zup.Investimentos.dtos.CadastroSimulacaoDTO;
import br.com.zup.Investimentos.dtos.ValorDeRendimentoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/simulacao")
public class SimulacaoController {


    private SimulacaoService simulacaoService;
    private ModelMapper modelMapper;

    @Autowired
    public SimulacaoController(SimulacaoService simulacaoService, ModelMapper modelMapper) {
        this.simulacaoService = simulacaoService;
        this.modelMapper = modelMapper;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)

    public ValorDeRendimentoDTO fazerSimulacao(@RequestBody @Valid CadastroSimulacaoDTO simulacaoDTO) {

        ValorDeRendimentoDTO valorDeRendimentoDTO = new ValorDeRendimentoDTO();

        valorDeRendimentoDTO.setRendimento(simulacaoService.fazerSimulacao(modelMapper.map(simulacaoDTO, Simulacao.class)));

        valorDeRendimentoDTO.setDataDeResgate(LocalDate.now().plusMonths(simulacaoDTO.getMesesDoInvestimento()));

        valorDeRendimentoDTO.setValorAplicado(simulacaoDTO.getDinheiroInvestido());

        return valorDeRendimentoDTO;


    }


    // Simulacao fazerSimulacao = modelMapper.map(simulacaoDTO, Simulacao.class);

    //  valorDeRendimentoDTO.setRendimento(simulacaoService.fazerSimulacao(fazerSimulacao));


}



