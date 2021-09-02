package br.com.zup.Investimentos.simulacao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "simulacao")
public class Simulacao {

    private String nomeDoInteressado;
    @Id
    private String emailDoInteressado;
    private String telefoneDoInteressado;
    private double dinheiroInvestido;
    private int mesesDoInvestimento;

    public Simulacao() {
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
