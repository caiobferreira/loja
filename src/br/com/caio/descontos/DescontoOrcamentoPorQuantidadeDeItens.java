package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoPorQuantidadeDeItens extends Desconto {
    public DescontoOrcamentoPorQuantidadeDeItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean descontoValido(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }
}
