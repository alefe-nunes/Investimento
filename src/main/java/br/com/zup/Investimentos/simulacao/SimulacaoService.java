package br.com.zup.Investimentos.simulacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimulacaoService {

    @Autowired
    private SimulacaoRepository simulacaoRepository;

    public Simulacao fazerSimulacao (Simulacao simulacao) {
       return simulacaoRepository.save(simulacao);
    }








}
