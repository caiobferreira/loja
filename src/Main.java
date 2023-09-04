import br.com.caio.descontos.CalculadoraDeDescontos;
import br.com.caio.imposto.CalculadoraDeImpostos;
import br.com.caio.imposto.ICMS;
import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 5);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println("Strategy");
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));

        Orcamento orcamento2 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDesconto = new CalculadoraDeDescontos();

        System.out.println("Chain of Responsibility");
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
        System.out.println(calculadoraDeDesconto.calcular(orcamento3));

        System.out.println("Template Method");
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
        System.out.println(calculadoraDeDesconto.calcular(orcamento3));


    }
}