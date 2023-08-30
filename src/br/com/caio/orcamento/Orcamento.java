package br.com.caio.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    private final BigDecimal valor;
    private final Integer quantidadeDeItens;


    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }
}
