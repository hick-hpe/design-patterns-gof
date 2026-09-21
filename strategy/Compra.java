package strategy;

class Compra {

    private Pagamento estrategia;

    public Compra(Pagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        estrategia.pagar(valor);
    }
}
