package strategy;

class PagamentoPix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor) + " realizado via Pix.");
    }
}