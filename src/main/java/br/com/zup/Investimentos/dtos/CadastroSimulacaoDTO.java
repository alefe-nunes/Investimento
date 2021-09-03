package br.com.zup.Investimentos.dtos;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class CadastroSimulacaoDTO {

    private String nomeDoInteressado;
    @Email (message = "{validacao.email.interessado}")
    private String emailDoInteressado;
    private String telefoneDoInteressado;
    @Min(value = 1000 , message = "{validacao.dinheiro.investido}")
    private double dinheiroInvestido;
    private int mesesDoInvestimento;

    public CadastroSimulacaoDTO() {
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
}
