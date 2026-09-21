package strategy;

/**
 * ExemploStrategy
 */
public class ExemploStrategy {

    public static void main(String[] args) {

        Compra compraPix = new Compra(new PagamentoPix());
        compraPix.realizarPagamento(100);

        Compra compraCartao = new Compra(new PagamentoCartao());
        compraCartao.realizarPagamento(100);

        Compra compraBoleto = new Compra(new PagamentoBoleto());
        compraBoleto.realizarPagamento(100);
    }

}