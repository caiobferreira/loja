package br.com.caio.pedido;

import br.com.caio.cliente.Cliente;
import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido{
    private Cliente cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(Cliente cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public Pedido executa(){
        return new Pedido(this.cliente, LocalDateTime.now(), new Orcamento(this.valorOrcamento, this.quantidadeItens));
    }
}
