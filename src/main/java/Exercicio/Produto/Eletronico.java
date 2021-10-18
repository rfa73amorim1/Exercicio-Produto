package Exercicio.Produto;

public class Eletronico extends Produto {


    public Eletronico(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    public double calcularValorTotal(double valor, int quantidade){
        return (valor*quantidade)*1.15;

    }
}
