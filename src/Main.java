import br.com.caio.imposto.CalculadoraDeImpostos;
import br.com.caio.imposto.ICMS;
import br.com.caio.imposto.ISS;
import br.com.caio.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));

    }
}