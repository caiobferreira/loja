package br.com.caio.pedido;

import br.com.caio.cliente.Cliente;
import br.com.caio.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
private Cliente cliente;
private LocalDateTime data;
private Orcamento orcamento;

    public Pedido(Cliente cliente, LocalDateTime data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
