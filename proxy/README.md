# Padrão de Projeto Proxy

O **Proxy** fornece um substituto para outro objeto, permitindo controlar o acesso ao objeto real.

No exemplo, o `ProxyArquivo` controla o acesso ao `ArquivoReal`. Antes de permitir a operação, ele verifica se o usuário está autorizado.

A parte principal da implementação é:

```java
if (!autorizado) {
    System.out.println("Acesso negado.");
    return;
}

if (arquivoReal == null) {
    arquivoReal = new ArquivoReal();
}

arquivoReal.acessar();
```

O código primeiro verifica a permissão e, caso o acesso seja permitido, encaminha a operação para o objeto real.

O sistema utiliza o Proxy através da mesma interface:

```java
Arquivo arquivo = new ProxyArquivo(true);
arquivo.acessar();
```

Assim, quem utiliza o objeto não precisa acessar diretamente o `ArquivoReal`.
