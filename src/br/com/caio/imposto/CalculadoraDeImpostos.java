package br.com.caio.imposto;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto. calcular(orcamento);
    }
}
