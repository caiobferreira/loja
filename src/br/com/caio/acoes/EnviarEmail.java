package br.com.caio.acoes;

import br.com.caio.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido{
    public boolean executar(Pedido pedido) {
        System.out.println("Envio de email");
        return true;
    }

}
