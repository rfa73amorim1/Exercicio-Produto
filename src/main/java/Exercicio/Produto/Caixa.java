package Exercicio.Produto;

import java.util.List;

public class Caixa {
    public void calcularTotal(List<Produto> produtos){
        double valorFinal = 0;
        for (Produto item: produtos) {
            System.out.println("Nome: "+ item.getNome() + " Quantidade: " + item.getQuantidade() + " Valor: "
                    + item.getValor() + " Valor Total: " + item.calcularValorTotal(item.getValor(),
                    item.getQuantidade()));
            valorFinal += item.calcularValorTotal(item.getValor(), item.getQuantidade());
        }
        System.out.println("Valor Final: " + valorFinal);
    }
}
