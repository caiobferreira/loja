package br.com.caio.descontos;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{
    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {
                return BigDecimal.ZERO;
    }
}
