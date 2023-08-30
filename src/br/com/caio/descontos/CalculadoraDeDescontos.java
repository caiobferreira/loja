package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoPorQuantidadeDeItens(new DescontoOrcamentoPorValor(new SemDesconto()));
        return desconto.calcular(orcamento);
       }
    }
