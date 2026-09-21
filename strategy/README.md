# Padrão de Projeto Strategy

O **Strategy** permite definir diferentes formas de realizar uma mesma tarefa e torná-las **intercambiáveis**.

No exemplo, uma compra pode utilizar diferentes estratégias de pagamento, como `PagamentoPix`, `PagamentoCartao` ou `PagamentoBoleto`.

A parte principal está na interface:

```java
interface Pagamento {
    void pagar(double valor);
}
```

As diferentes formas de pagamento implementam essa interface:

```java
class PagamentoPix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Pix.");
    }
}
```

A classe `Compra` recebe uma estratégia e utiliza o método definido pela interface:

```java
public Compra(Pagamento estrategia) {
    this.estrategia = estrategia;
}

public void realizarPagamento(double valor) {
    estrategia.pagar(valor);
}
```

Assim, a estratégia pode ser trocada sem modificar a classe `Compra`:

```java
Compra compraPix = new Compra(new PagamentoPix());
Compra compraCartao = new Compra(new PagamentoCartao());
```
