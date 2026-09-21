package strategy.src;

class MediaSimples implements CalculoNota {

    @Override
    public double calcular(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}