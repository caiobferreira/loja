package br.com.caio.pedido;

import br.com.caio.cliente.Cliente;
import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido extends Pedido {
    private Cliente cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(Cliente cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        super(cliente, LocalDateTime.now(), new Orcamento(valorOrcamento, quantidadeItens));
    }

    public boolean salvar(){
        return new GerarPedidoHandler(this) {
            @Override
            public boolean salvar() {
                return false;
            }
        }.salvar();
    }
}
