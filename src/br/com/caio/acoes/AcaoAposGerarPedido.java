package br.com.caio.acoes;

import br.com.caio.pedido.Pedido;

public interface AcaoAposGerarPedido {
    public boolean executar(Pedido pedido);
}
