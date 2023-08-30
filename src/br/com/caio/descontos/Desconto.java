package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    protected Desconto proximo;

    public abstract BigDecimal calcular(Orcamento orcamento);

}
