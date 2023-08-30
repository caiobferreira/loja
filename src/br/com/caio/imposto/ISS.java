package br.com.caio.imposto;

import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
