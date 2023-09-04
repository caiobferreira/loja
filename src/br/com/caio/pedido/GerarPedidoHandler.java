package br.com.caio.pedido;

import br.com.caio.acoes.AcaoAposGerarPedido;

import java.util.List;

public class GerarPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //ponto do código onde seriam injetadas dependencias para salvar em bd.
    public boolean salvar(Pedido pedido) {
        acoes.forEach(a -> a.executar(pedido));
        return true;
    };
}
