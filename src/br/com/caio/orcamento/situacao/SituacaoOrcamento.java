package br.com.caio.orcamento.situacao;

import br.com.caio.DomainException;
import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento){
       return BigDecimal.ZERO;
    };

    public  void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado");
    };
    public  void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reprovado");
    };

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser finalizado");
    };
}
