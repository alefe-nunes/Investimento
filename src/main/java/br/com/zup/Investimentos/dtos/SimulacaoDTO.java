package br.com.zup.Investimentos.dtos;

import br.com.zup.Investimentos.simulacao.Simulacao;

public class SimulacaoDTO {

    private String nomeDoInteressado;
    private String emailDoInteressado;
    private String telefoneDoInteressado;
    private double dinheiroInvestido;
    private int mesesDoInvestimento;

    public SimulacaoDTO() {
    }

    public String getNomeDoInteressado() {
        return nomeDoInteressado;
    }

    public void setNomeDoInteressado(String nomeDoInteressado) {
        this.nomeDoInteressado = nomeDoInteressado;
    }

    public String getEmailDoInteressado() {
        return emailDoInteressado;
    }

    public void setEmailDoInteressado(String emailDoInteressado) {
        this.emailDoInteressado = emailDoInteressado;
    }

    public String getTelefoneDoInteressado() {
        return telefoneDoInteressado;
    }

    public void setTelefoneDoInteressado(String telefoneDoInteressado) {
        this.telefoneDoInteressado = telefoneDoInteressado;
    }

    public double getDinheiroInvestido() {
        return dinheiroInvestido;
    }

    public void setDinheiroInvestido(double dinheiroInvestido) {
        this.dinheiroInvestido = dinheiroInvestido;
    }

    public int getMesesDoInvestimento() {
        return mesesDoInvestimento;
    }

    public void setMesesDoInvestimento(int mesesDoInvestimento) {
        this.mesesDoInvestimento = mesesDoInvestimento;
    }

    public static SimulacaoDTO converterModelParaDTO(Simulacao simulacao) {

        SimulacaoDTO simulacaoDTO = new SimulacaoDTO();

        simulacaoDTO.setNomeDoInteressado(simulacao.getNomeDoInteressado());
        simulacaoDTO.setEmailDoInteressado(simulacao.getEmailDoInteressado());
        simulacaoDTO.setTelefoneDoInteressado(simulacao.getTelefoneDoInteressado());
        simulacaoDTO.setDinheiroInvestido(simulacao.getDinheiroInvestido());
        simulacaoDTO.setMesesDoInvestimento(simulacao.getMesesDoInvestimento());

        return simulacaoDTO;
    }
}
