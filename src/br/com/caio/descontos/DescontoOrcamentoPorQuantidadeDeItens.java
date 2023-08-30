package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorQuantidadeDeItens extends Desconto{
    public DescontoOrcamentoPorQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
