package br.com.caio.acoes;

import br.com.caio.pedido.Pedido;

public class SalvarBD implements AcaoAposGerarPedido{
    public boolean executar(Pedido pedido) {
        System.out.println("Salva BD");
        return true;
    }
}
