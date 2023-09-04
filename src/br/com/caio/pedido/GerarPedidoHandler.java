package br.com.caio.pedido;

public abstract class GerarPedidoHandler {
    private Pedido pedido;

    public GerarPedidoHandler(Pedido pedido) {
        this.pedido = pedido;
    }

    //ponto do código onde seriam injetadas dependencias para salvar em bd.
    public abstract boolean salvar();
}
