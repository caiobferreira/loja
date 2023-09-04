import br.com.caio.acoes.EnviarEmail;
import br.com.caio.acoes.SalvarBD;
import br.com.caio.cliente.Cliente;
import br.com.caio.descontos.CalculadoraDeDescontos;
import br.com.caio.imposto.CalculadoraDeImpostos;
import br.com.caio.imposto.ICMS;
import br.com.caio.orcamento.Orcamento;
import br.com.caio.pedido.GeraPedido;
import br.com.caio.pedido.GerarPedidoHandler;
import br.com.caio.pedido.Pedido;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        Orcamento orcamento2 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDesconto = new CalculadoraDeDescontos();
        Cliente cliente = new Cliente("Caio");

        System.out.println("Strategy");
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));

        System.out.println("Chain of Responsibility");
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
        System.out.println(calculadoraDeDesconto.calcular(orcamento3));

        System.out.println("Template Method");
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
        System.out.println(calculadoraDeDesconto.calcular(orcamento3));

        System.out.println("State");
        System.out.println(orcamento.getValor());
        orcamento.aplicarDescontoExtra();
        orcamento.aprovar();
        System.out.println(orcamento.getValor());
        System.out.println("Command");
        GeraPedido gerador = new GeraPedido(cliente, orcamento.getValor(), orcamento.getQuantidadeDeItens());
        GerarPedidoHandler handler = new GerarPedidoHandler(Arrays.asList(
                new EnviarEmail(),
                new SalvarBD()
        ));
        handler.salvar(gerador.executa());
    // Actions após pedido ser criado, integração com banco de dados dependency injection;

    }
}