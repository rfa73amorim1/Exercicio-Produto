package Exercicio.Produto;

public class Movel extends Produto {

    public Movel(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    public double calcularValorTotal (double valor, int quantidade){
        if (quantidade<10){
            return (valor*quantidade)*1.11;
        }else {
            return (valor*quantidade)*1.05;
        }
    }
}
