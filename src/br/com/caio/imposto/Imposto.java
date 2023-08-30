package br.com.caio.imposto;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
