# Padrão de Projeto Prototype

O **Prototype** é útil quando criar um objeto do zero envolve muitas configurações ou quando é necessário criar rapidamente vários objetos semelhantes.

No exemplo, um personagem já configurado pode ser **clonado**, criando um novo objeto com as mesmas características. Depois, apenas as informações que precisam ser diferentes são alteradas.

A parte principal da implementação é o método `clone()`:

```java
@Override
public Personagem clone() {
    try {
        return (Personagem) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
    }
}
```

E a clonagem é realizada através de:

```java
Personagem outroGuerreiro = guerreiro.clone();
```

Dessa forma, `outroGuerreiro` recebe uma cópia do objeto `guerreiro`, podendo ser modificado de forma independente.
