package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected Desconto proximo;

    public BigDecimal calcular(Orcamento orcamento) {
        if (descontoValido(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean descontoValido(Orcamento orcamento);

}
