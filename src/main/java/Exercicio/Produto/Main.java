package Exercicio.Produto;

/*
Utilizando conceitos Orientação a Objetos, crie uma classe chamada Produto com os atributos:
nome, valor(double) e quantidade(int) e um método chamado:
calcularValorFinal() que irá retornar o valor total (valor x quantidade) e
acrescentar 10% de imposto nesse valor total.
Crie duas classes herdando Produto: Eletrônico e Móvel.
Implemente a fuinção calcularValorFinal() da seguinte maneira para cada classe:
- A classe Eletrônico deverá acrescentar 15% de imposto no valor final;
- A classe Móvel deverá acrescentar  11% de imposto no valor final se a quantidade for menor que 10
 e 5% se a quantidade for maior ou igual a 10.

 Crie uma classe chamada Caixa com a função chamada: calcularTotal que recebe uma lista de Produtos.
 A função calcularTotal deverá imprimir o nome do Produto, valor, quantidade e valor final de cada produto e
 no final da função, imprimir quanto deverá ser pago no total de todos os produtos passados.
 Crie a seguinte lista para ser passada para a função calcularTotal:

 CLASSE         NOME            QUANTIDADE      VALOR
 Eletronico     Ventilador      3               R$320,00
 Eletronico     Computador      2               R$3999,00
 Movel          Mesa            2               R$270,00
 Produto        Caderno         10              R$10,50
 Movel          Cadeira         2               R$234,25
 Produto        Caneta          15              R$0,70

 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[]Args){

        List<Produto> produtos = new ArrayList<>();

        Produto ventilador = new Eletronico("Ventilador",320, 3);
        Produto computador = new Eletronico("Computadpr",3999, 2);
        Produto mesa = new Movel("Mesa",270, 2);
        Produto caderno = new Produto("Caderno",10.50, 10);
        Produto cadeira = new Movel("Cadeira",234.25, 2);
        Produto caneta = new Produto("Caneta",0.70, 15);

        produtos.add(ventilador);
        produtos.add(computador);
        produtos.add(mesa);
        produtos.add(caderno);
        produtos.add(cadeira);
        produtos.add(caneta);

        Caixa caixa = new Caixa();
        caixa.calcularTotal(produtos);


    }
}
